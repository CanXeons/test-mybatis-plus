package cn.xeonscan.mp.service;

import cn.xeonscan.mp.pojo.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HotelService{
    Hotel selectById(int id);
    List<Hotel> selectAll();
}
