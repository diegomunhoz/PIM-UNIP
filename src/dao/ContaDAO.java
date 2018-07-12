package dao;

import java.util.ArrayList;
import model.Conta;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class ContaDAO extends GenericDAO {

    @SuppressWarnings("unchecked")
    public ArrayList<Conta> buscarTodos() throws Exception {
        ArrayList<Conta> listaRetorno = new ArrayList<Conta>();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = sessao.createCriteria(Conta.class);
        criteria.addOrder(Order.asc("idConta"));
        listaRetorno = (ArrayList<Conta>) criteria.list();
        sessao.close();
        return listaRetorno;
    }

    public Conta buscarPorCodigo(Long codigo) throws Exception {
        Session sessao = null;
        Conta conta = null;
        sessao = HibernateUtil.getSessionFactory().openSession();
        conta = (Conta) sessao.get(Conta.class, codigo);
        return conta;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Conta> buscarPorNome(String nome) throws Exception {
        ArrayList<Conta> listaRetorno = new ArrayList<Conta>();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = sessao.createCriteria(Conta.class);
        criteria.add(Restrictions.ilike("nome", "%" + nome + "%"));
        criteria.addOrder(Order.asc("nome"));
        listaRetorno = (ArrayList<Conta>) criteria.list();
        return listaRetorno;
    }
}