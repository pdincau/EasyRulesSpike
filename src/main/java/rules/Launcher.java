package rules;

import domain.Person;
import org.easyrules.api.RulesEngine;

import static org.easyrules.core.RulesEngineBuilder.aNewRulesEngine;

public class Launcher {

    public static void main(String[] args) {
        //create a person instance
        Person tom = new Person("Tom", 19);
        System.out.println("Tom: Hi! can I have some Vodka please?");

        //create a rules engine
        RulesEngine rulesEngine = aNewRulesEngine()
                .named("shop rules engine")
                .build();

        //register rules
        rulesEngine.registerRule(new AgeRule(tom));
        rulesEngine.registerRule(new AlcoholRule(tom));

        //fire rules
        rulesEngine.fireRules();
    }


}