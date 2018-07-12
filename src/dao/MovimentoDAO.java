package dao;

import java.util.ArrayList;
import model.Movimento;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import util.HibernateUtil;

public class MovimentoDAO extends GenericDAO {

    @SuppressWarnings("unchecked")
    public ArrayList<Movimento> buscarTodos() throws Exception {
        ArrayList<Movimento> listaRetorno = new ArrayList<Movimento>();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = sessao.createCriteria(Movimento.class);
        criteria.addOrder(Order.asc("idMovimento"));
        listaRetorno = (ArrayList<Movimento>) criteria.list();
        return listaRetorno;
    }

}