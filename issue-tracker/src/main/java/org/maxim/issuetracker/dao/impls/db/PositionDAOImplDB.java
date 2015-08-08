package org.maxim.issuetracker.dao.impls.db;

import org.hibernate.SessionFactory;
import org.maxim.issuetracker.dao.interfaces.PositionDAO;
import org.maxim.issuetracker.domain.Position;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PositionDAOImplDB extends AbstractDAOHelperDB implements PositionDAO {

    public PositionDAOImplDB() { }

    public PositionDAOImplDB(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public void save(Position position) {
        currentSession().save(position);
    }

    @Override
    public void delete(int id) {
        Position obj = findById(id);
        if (obj != null) {
            currentSession().delete(obj);
        }
    }

    @Override
    public Position findById(int id) {
        return (Position) currentSession().get(Position.class, id);
    }

    @Override
    public List<Position> list() {
        return currentSession().createQuery("from Position").list();
    }

}