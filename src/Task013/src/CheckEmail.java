/**
 * Created by sentpim on 24.03.2016.
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Aspect
public class CheckEmail {

    @Around("execution(* *..*.setEmail(String))")
    public Object check(ProceedingJoinPoint jp) throws Throwable {
        String email = (String) jp.getArgs()[0];
        System.out.println(email);
        Pattern em = Pattern.compile("([a-z0-9_\\.-])+@[a-z0-9-]+\\.([a-z]{2,4}\\.)?[a-z]{2,4}");
        Matcher em1 = em.matcher(email);

        if (em1.find()) {
            System.out.println("Good job");
            return null;
        }
        return jp.proceed();
    }
}

