package com.uiys.U4_原型模式;

import java.io.ByteArrayInputStream;
import java.util.Date;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 试一下浅拷贝
        /*HealthReport healthReport = new HealthReport();
        Person personA = new Person();
        personA.setGender(GenderEnum.MEAL);
        personA.setAge(18);
        personA.setName("A");
        healthReport.setPerson(personA);
        healthReport.setReportDate(new Date());
        healthReport.setHealthyLeve(HealthyLeve.GOOD);
        HealthReport healthReport1 = shoowdClone(healthReport);
        System.out.println(healthReport);
        System.out.println(healthReport1);*/

        HealthReport healthReport233 = new HealthReport();
        Person personAA = new Person();
        personAA.setGender(GenderEnum.MEAL);
        personAA.setAge(18);
        personAA.setName("A");
        healthReport233.setPerson(personAA);
        healthReport233.setReportDate(new Date());
        healthReport233.setHealthyLeve(HealthyLeve.GOOD);
        HealthReport healthReport333 = deepClone(healthReport233);
        System.out.println(healthReport233);
        System.out.println(healthReport333);
    }

    public static HealthReport shoowdClone(HealthReport healthReport) throws CloneNotSupportedException {
        HealthReport clone = healthReport.clone();
        clone.setHealthyLeve(HealthyLeve.BAD);
        Person person = clone.getPerson();
        person.setName("B");
        person.setAge(10);
        person.setGender(GenderEnum.LGBT);
        return clone;
    }

    public static HealthReport deepClone(HealthReport healthReport) throws CloneNotSupportedException {
        HealthReport clone = healthReport.deppClone();
        clone.setHealthyLeve(HealthyLeve.BAD);
        Person person = clone.getPerson();
        person.setName("CCC");
        person.setAge(101);
        person.setGender(GenderEnum.LGBT);
        return clone;

    }
}


