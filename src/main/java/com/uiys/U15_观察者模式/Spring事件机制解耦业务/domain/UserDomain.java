package com.uiys.U15_观察者模式.Spring事件机制解耦业务.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author uiys
 * @date 2023/9/6
 */
@Data
public class UserDomain implements Serializable {

    private String id;

    private String name;

    private String email;

    private Date registerTime;

}


