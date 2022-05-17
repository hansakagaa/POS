package bo;

import dao.custom.CustomerDAO;
import dao.custom.impl.CustomerDAOImpl;
import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl {
    private final CustomerDAO customerDAO = new CustomerDAOImpl();

    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
        return customerDAO.getAll();
    }

    public void saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        customerDAO.save(customerDTO);
    }

    public void UpdateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        customerDAO.update(customerDTO);
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.exist(id);
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        customerDAO.delete(id);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return customerDAO.generateNewID();
    }
}
