package hello.typeconverter;

import hello.typeconverter.convertor.IntegerToStringConverter;
import hello.typeconverter.convertor.IpPortToStringConverter;
import hello.typeconverter.convertor.StringToIntegerConverter;
import hello.typeconverter.convertor.StringToIpPortConverter;
import hello.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        // 주석처리(우선순위 때문)
        registry.addConverter(new StringToIpPortConverter());
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new IpPortToStringConverter());

        // 추가
        registry.addFormatter(new MyNumberFormatter());
    }
}
