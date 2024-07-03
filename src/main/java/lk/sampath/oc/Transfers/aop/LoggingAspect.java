package lk.sampath.oc.Transfers.aop;


import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Aspect for logging execution of service and repository Spring components.
 */
@Aspect
@Component
public class LoggingAspect {

	private final Logger log = LoggerFactory.getLogger(this.getClass());


	/**
	 * Pointcut that matches all repositories, services and Web REST endpoints.
	 */
	 @Pointcut("within(@org.springframework.stereotype.Repository *)" +
		        " || within(@org.springframework.stereotype.Service *)" +
		        " || within(@org.springframework.web.bind.annotation.RestController *)")
	public void springBeanPointcut() {
		// Method is empty as this is just a Pointcut, the implementations are in the
		// advices.
	}

	/**
	 * Pointcut that matches all Spring beans in the application's main packages.
	 */
	@Pointcut("within(lk.sampath.oc.Transfers.Controllers.*)")
	public void controllerPackagePointcut() {
		// Method is empty as this is just a Pointcut, the implementations are in the
		// advices.
	}

	/**
	 * Pointcut that matches all Spring beans in the application's main packages.
	 */
	@Pointcut("within(lk.sampath.oc.Transfers.Service.*)")
	public void servicesPackagePointcut() {
		// Method is empty as this is just a Pointcut, the implementations are in the
		// advices.
	}
	/**
	 * Pointcut that matches all Spring beans in the application's main packages.
	 */
	@Pointcut("within(lk.sampath.oc.Transfers.Service.externel.*)")
	public void servicesExternelPackagePointcut() {
		// Method is empty as this is just a Pointcut, the implementations are in the
		// advices.
	}

	/**
	 * Pointcut that matches all Spring beans in the application's main packages.
	 */
	@Pointcut("within(lk.sampath.oc.Transfers.Repository.*)")
	public void repositoryPackagePointcut() {
		// Method is empty as this is just a Pointcut, the implementations are in the
		// advices.
	}

	/**
	 * Pointcut that matches all Spring beans in the application's main packages.
	 */
	@Pointcut("within(lk.sampath.oc.Transfers.Repository.*)" + " || within(lk.sampath.oc.Transfers.Service.*)"
			+ " || within(lk.sampath.oc.Transfers.Controllers.*)")
	public void applicationPackagePointcut() {
		// Method is empty as this is just a Pointcut, the implementations are in the
		// advices.
	}

	/**
	 * Advice that logs methods call Rest API.
	 *
	 * @param joinPoint join point for advice
	 * @param e         exception
	 */
	@Before("controllerPackagePointcut() && servicesExternelPackagePointcut()")
	public void beforeCalling(JoinPoint joinPoint) {
		log.info("Method Name :" + joinPoint.getSignature().toShortString() + "| Args => "
				+ Arrays.asList(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "controllerPackagePointcut()", returning = "result")
	public void afterCalling(JoinPoint joinPoint, Object result) {
		log.info("Method Name :" + joinPoint.getSignature().toShortString() + "| response => " + result.toString());
	}

	/**
	 * Advice that logs methods throwing exceptions.
	 *
	 * @param joinPoint join point for advice
	 * @param e         exception
	 */
	@AfterThrowing(pointcut = "applicationPackagePointcut() && controllerPackagePointcut() && servicesPackagePointcut() && repositoryPackagePointcut()", throwing = "e")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
		log.error("Exception in {}.{}() with cause = {}", joinPoint.getSignature().getDeclaringTypeName(),
				joinPoint.getSignature().getName(), e.getCause() != null ? e.getCause() : "NULL");
	}

	/**
	 * Advice that logs when a method is entered and exited.
	 *
	 * @param joinPoint join point for advice
	 * @return result
	 * @throws Throwable throws IllegalArgumentException
	 */
	@Around("applicationPackagePointcut() && springBeanPointcut()")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		if (log.isDebugEnabled()) {
			log.debug("Enter: {}.{}() with argument[s] = {}", joinPoint.getSignature().getDeclaringTypeName(),
					joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
		}
		try {
			Object result = joinPoint.proceed();
			if (log.isDebugEnabled()) {
				log.info("Exit: {}.{}() with result = {}", joinPoint.getSignature().getDeclaringTypeName(),
						joinPoint.getSignature().getName(), result);
			}
			return result;
		} catch (IllegalArgumentException e) {
			log.error("Illegal argument: {} in {}.{}()", Arrays.toString(joinPoint.getArgs()),
					joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());

			throw e;
		}
	}
}
