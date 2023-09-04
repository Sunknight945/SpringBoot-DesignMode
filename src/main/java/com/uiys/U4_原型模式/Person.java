package com.uiys.U4_原型模式;

import lombok.Data;

import java.io.Serializable;

/**
 * @author uiys
 * @date 2023/9/5
 */
@Data
public class Person implements Serializable {
    private String name;
    private Integer age;
    private GenderEnum gender;
}


