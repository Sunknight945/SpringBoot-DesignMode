package com.uiys.U4_原型模式;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * @author uiys
 * @date 2023/9/5
 * 这个是个人的体检报告
 */
@Data
public class HealthReport implements Cloneable, Serializable {
    private Person person;
    private HealthyLeve healthyLeve;
    @JsonFormat(timezone = "GMT+8", pattern = "MM/dd/YYYY HH:mm:ss")
    private Date reportDate;

    /**
     * @return
     * @throws CloneNotSupportedException 对象浅拷贝, 对象中按值类型传递部分能完美拷贝走,
     *                                    但是按引用类型传递部分则拷贝不走.
     */
    @Override
    protected HealthReport clone() throws CloneNotSupportedException {
        return (HealthReport)super.clone();
    }

    @Override
    public String toString() {
        return String.format("日期 %s \t, 等级 %s \t, 姓名: %s \t, 性别: %s \t, 年龄: %s \n", this.reportDate, this.healthyLeve, this.person.getName(),
            this.person.getGender(), this.person.getAge());
    }

    /**
     * 问题在于引用对象和内存的管理
     * 如果不开辟新的内存, 那么引用对象的指向一定会重复,
     * 所以此时的修改会造成对象的修改.
     * @return
     */
    public HealthReport deppClone() {
        HealthReport healthReport1 = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(baos);
            objectOutputStream.writeObject(this);
            byte[] byteArray = baos.toByteArray();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            healthReport1 =(HealthReport) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return healthReport1;
    }
}


