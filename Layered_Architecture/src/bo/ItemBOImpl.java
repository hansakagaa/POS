package bo;

import dao.custom.ItemDAO;
import dao.custom.impl.ItemDAOImpl;
import model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl {
    private final ItemDAO itemDAO = new ItemDAOImpl();


    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }

    public void deleteItem(String code) throws SQLException, ClassNotFoundException {
        itemDAO.delete(code);
    }

    public void saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        itemDAO.save(itemDTO);
    }

    public void updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        itemDAO.update(itemDTO);
    }

    public boolean existItem(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(code);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return itemDAO.generateNewID();
    }
}
