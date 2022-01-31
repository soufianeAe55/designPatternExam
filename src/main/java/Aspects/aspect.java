package Aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Aspect
public class aspect {
    private long t1,t2;
    private Logger logger= Logger.getLogger(this.getClass().getName());
    
    public aspect() throws IOException {
        logger.addHandler(new FileHandler("logUml.xml"));
        logger.setUseParentHandlers(false);
    }

    @Pointcut("execution(* uml.DiagrammeClasse.createDiargramme(..))")
    public void pc1(){}

    @Before("pc1()")
    public void before(JoinPoint joinPoint){

        logger.info("---------Test UML CASE----------");
        logger.info("---------Beggin----------");
        t1=System.currentTimeMillis();
        logger.info("Before "+joinPoint.getSignature());
    }

    @After("pc1()")
    public void after(JoinPoint joinPoint){
            t2=System.currentTimeMillis();
            logger.info("After "+joinPoint.getSignature());
            logger.info("Duration:"+(t2-t1));
        logger.info("---------END----------");
    }

}
