package com.cui.dao.mapper;

import com.cui.fs.model.Collage;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * Created by cjs
 * Date： 2017/10/25.
 * Time： 14:30.
 */
@Mapper
public interface CollageMapper {
     List<Collage> getCollageList(Map map);

     Integer getCollageCount(Map map);

     Collage getCollageById(Integer id);

     int addCollage(Collage cp);

     int updateCollage(Collage cp);

     int delCollage(Integer id);

}
