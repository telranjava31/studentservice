package telran.java31.student.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StudentDto {
	Integer id;
	String name;
	String password;
}
