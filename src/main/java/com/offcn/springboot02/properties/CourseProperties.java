package com.offcn.springboot02.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@ConfigurationProperties(prefix = "course")
public class CourseProperties {

    String type = "公考";
    String time = "20d";
    String price = "5.6w";

}
