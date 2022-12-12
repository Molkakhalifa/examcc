package esprit.tn.khalifamolka.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class aspect {

	@After("execution(void  esprit.tn.khalifamolka.aspect.*.*(..))")
	public void logMethodExit(JoinPoint joinPoint) {

		String name = joinPoint.getSignature().getName();
        log.info("Out of method :" + name );}

}
