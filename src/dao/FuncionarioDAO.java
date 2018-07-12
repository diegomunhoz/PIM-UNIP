package dao;

import java.util.ArrayList;
import model.Funcionario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class FuncionarioDAO extends GenericDAO {

    @SuppressWarnings("unchecked")
    public ArrayList<Funcionario> buscarTodos() throws Exception {
        ArrayList<Funcionario> listaRetorno = new ArrayList<Funcionario>();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = sessao.createCriteria(Funcionario.class);
        criteria.addOrder(Order.asc("idFuncionario"));
        listaRetorno = (ArrayList<Funcionario>) criteria.list();
        return listaRetorno;
    }

    public Funcionario buscarPorCodigo(Long codigo) throws Exception {
        Session sessao = null;
        Funcionario cliente = null;
        sessao = HibernateUtil.getSessionFactory().openSession();
        cliente = (Funcionario) sessao.get(Funcionario.class, codigo);
        return cliente;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Funcionario> buscarPorNome(String nome) throws Exception {
        ArrayList<Funcionario> listaRetorno = new ArrayList<Funcionario>();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = sessao.createCriteria(Funcionario.class);
        criteria.add(Restrictions.ilike("nome", "%" + nome + "%"));
        criteria.addOrder(Order.asc("nome"));
        listaRetorno = (ArrayList<Funcionario>) criteria.list();
        return listaRetorno;
    }
}