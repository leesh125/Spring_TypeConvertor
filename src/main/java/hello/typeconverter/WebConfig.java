package hello.typeconverter;

import hello.typeconverter.convertor.IntegerToStringConverter;
import hello.typeconverter.convertor.IpPortToStringConverter;
import hello.typeconverter.convertor.StringToIntegerConverter;
import hello.typeconverter.convertor.StringToIpPortConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new StringToIntegerConverter());
        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new IpPortToStringConverter());
    }
}
