package dao.interfaces;

import model.Vacancy;

import java.util.List;

public interface VacancyDao {

    List<Vacancy> findAll();

    List<Vacancy> findVisible();

    List<Vacancy> findAllOfCompany(int companyId);

    void save(Vacancy vacancy) throws Exception;

    Vacancy getById(int id);

    void update(Vacancy vacancy);

    void delete(int id);

}