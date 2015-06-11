package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdoConfig {
   @Bean
   public Performer duke()
   {
	   return new Juggler();
   }
   
   @Bean
   public Performer duke15()
   {
	   return new Juggler(15);
   }
   @Bean
   public Performer kenny()
   {
	   Instrumentalist kenny = new Instrumentalist();
	   kenny.setSong("ZXZZZMMM");
	   return kenny;
	   
   }
   
   @Bean
   public Poem sonnet29()
   {
	   Sonnet29 sonnet29 = new Sonnet29();
	   return sonnet29;
   }
   
   @Bean
   public Performer poetickDuke()
   {
	return new PeoticJuggler(sonnet29());
	   
   }
}
