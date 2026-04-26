package com.telusko.SpringJDBC.repository;

import com.telusko.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student s) {
            System.out.println("Student saved in repository: " );
            String sql = "INSERT INTO hibdb.student (id, name, technology) VALUES (?, ?,?)";
        int rows = jdbcTemplate.update(sql, s.getId(), s.getName(), s.getTechnology());
        System.out.println("Rows affected: " + rows);
    }

public List<Student> findAll() {
    System.out.println("Finding all students: " );

    String getSql = "SELECT * FROM hibdb.student";

    RowMapper<Student> rowMapper = ( rs,  rowNum) -> {
                    Student s = new Student();
                    s.setId(rs.getInt("id"));
                    s.setName(rs.getString("name"));
                    s.setTechnology(rs.getString("technology"));
                    return s;
    };

    return jdbcTemplate.query(getSql, rowMapper);

//    RowMapper<Student> rowMapper = new RowMapper<Student>() {
//        @Override
//
//        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//            Student s = new Student();
//            s.setId(rs.getInt("id"));
//            s.setName(rs.getString("name"));
//            s.setTechnology(rs.getString("technology"));
//            return s;
//        }
//    };







//                Student s1 = new Student();
//                s1.setId(1);
//                s1.setName("Alice");
//                s1.setTechnology("java");
//
//                Student s2 = new Student();
//                s2.setId(2);
//                s2.setName("Bob");
//                s2.setTechnology("oracle");
//
//                students.add(s1);
//                students.add(s2);
//            return students;

    }

    public void remove(Student s) {
        String deleteSql = "DELETE FROM hibdb.student WHERE id = ?";
        int rows = jdbcTemplate.update(deleteSql, s.getId());
        System.out.println("Rows deleted: " + rows);
    }
}
