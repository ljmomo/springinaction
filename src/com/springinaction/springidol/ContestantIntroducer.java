package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;
@Component("declareAspect")
@Aspect
public class ContestantIntroducer {
@DeclareParents(value="com.springinaction.springidol.Performer+",defaultImpl=GraciousContestant.class)
public static Contestant contestant;
}
