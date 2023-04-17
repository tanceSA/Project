package com.test02.selfdefine.apply;

import java.util.List;

/**
 * ClassName: DAO
 * Package: com.test02.selfdefine.apply
 * Description:
 *      DAO: data(base) access object。 內部封裝了資料庫相關表的增刪改查(CRUD)操作
 * @Author: TANCE
 * @Create 2023/4/17 下午 02:39
 * @Version 1.0
 */
public class DAO<T> {
    //Create
    public void insert(T bean){
        //通過相對應的SQL語法將bean物件的資料寫入到資料庫中
    }
    //Read
    public T queryForInstance(){
        return null;
    }

    public List<T> queryForList(){
        return null;
    }

    //Update
    public void update(int id,T bean){

    }

    //Delete
    public T deleteById(int id){
        T t = null;
        return t;
    }

    //泛型方法
    public <E> E getValue(String sql){
        return  null;
    }
}
