package cn.xeonscan.mp.mapper;

import cn.xeonscan.mp.pojo.Hotel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HotelMapperTest {
    @Autowired
    HotelMapper hotelMapper;
    @Test
    public void test(){
        final Hotel hotel = hotelMapper.selectById(36934);
        System.out.println(hotel);

    }
}