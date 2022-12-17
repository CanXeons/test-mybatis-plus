package cn.xeonscan.mp.service;

import cn.xeonscan.mp.mapper.HotelMapper;
import cn.xeonscan.mp.pojo.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private HotelMapper hotelMapper;
    @Override
    public Hotel selectById(int id) {
        return hotelMapper.selectById(id);
    }

    @Override
    public List<Hotel> selectAll() {
        return hotelMapper.selectList(null);

    }
}
