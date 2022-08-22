package view;

import com.tangosol.util.stream.RemoteCollectors;

import java.awt.event.ActionEvent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.stream.Collectors;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichSelectManyListbox;

import oracle.adf.view.rich.render.ClientEvent;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import skh.adf.custom.shared.ADFUtil;
import skh.adf.custom.shared.JSFUtils;


/// Set select- item in listner

public class selectionBean {

//    private List<SelectItem> allEmployeesList;
//    private List<SelectItem> searchableList;
//    private List selectedValues;
    private List returnValues;
    private List initialItems;
//    private SelectItem removeSelectedItem;
//    private List<SelectItem> actualSelectedValues = new ArrayList<SelectItem>();

//    private String keyword;
//    private int selectionDisplayRange = 3;
    
    public List<SelectItem> getInitialItems() {
        List itms = new ArrayList<SelectItem>();
//        itms.add(new SelectItem(100, "Steven King"));
        itms.add(new SelectItem(102, "Lex De Haan"));
        itms.add(new SelectItem(103, "Alexander Hunold"));
        return itms;
    }

    public selectionBean() {
//        allEmployeesList = new ArrayList<SelectItem>();
//        
//        DCIteratorBinding dc = ADFUtil.findIterator("EmployeesView1Iterator");
//        RowSetIterator iterator = dc.getRowSetIterator();
//        iterator.reset();
//        while (iterator.hasNext()) {
//            Row row = iterator.next();
//            Object empId = row.getAttribute("EmployeeId");
//            String name = row.getAttribute("FirstName") + " " + row.getAttribute("LastName");
//            allEmployeesList.add(new SelectItem(empId, name));
//        }
    }

    ///// Actions //////////////////////////////////////////////////////////////////////////////////////////////////////

//    public void filterList(ClientEvent clientEvent) {
//        String keyword = (String) clientEvent.getParameters().get("filterKey");
//        searchableList = allEmployeesList.stream()
//                                         .filter(emp -> emp.getLabel().toLowerCase().startsWith(keyword.toLowerCase()))
//                                         .collect(RemoteCollectors.toList());
//    }
//    
//    public String removeSelected() {
//        if (removeSelectedItem != null) {
//            // remove from selected items
//            Iterator<SelectItem> empIter = actualSelectedValues.iterator();
//            while (empIter.hasNext()) {
//                SelectItem emp = empIter.next();
//                if (emp.getValue() == removeSelectedItem.getValue()) {
//                    empIter.remove();
//                    break;
//                }
//            }
//            // handle Show all button visibality
//            if (selectionDisplayRange > 3 && actualSelectedValues != null && actualSelectedValues.size() < 5) {
//                selectionDisplayRange = 3;
//            }
//            // add removed item to main arrays
//            allEmployeesList.add(removeSelectedItem);
//            searchableList.add(removeSelectedItem);
//        }
//        return null;
//    }
//    
//    public void selectionListner(ValueChangeEvent valueChangeEvent) {
//        List<Integer> values = (List<Integer>) valueChangeEvent.getNewValue();
//
////        List<Object> ids = new ArrayList<Object>();
////        actualSelectedValues.forEach(i -> ids.add(i.getValue()));
//
//        if (values != null) {
//            for (Integer item : values) {
////                if (ids.contains(item)) {
////                } else {
//                // remove selected item from searchableList
//                    Iterator<SelectItem> iterator = searchableList.iterator();
//                    while (iterator.hasNext()) {
//                        SelectItem element = iterator.next();
//                        if (element.getValue() == item) {
//                            actualSelectedValues.add(element);
//                            iterator.remove();
//                            
//                            Iterator<SelectItem> empIter = allEmployeesList.iterator();
//                            while (empIter.hasNext()) {
//                                SelectItem emp = empIter.next();
//                                if (emp.getValue() == item) {
//                                    empIter.remove();
//                                    break;
//                                }
//                            }
//                            break;
//                        }
//                    }
////                }
//            }
//            System.err.println("RETURN > " + getReturnValues());
//        }
//    }
//
//    public String showAllSelections() {
//        if (selectionDisplayRange == 3) {
//            selectionDisplayRange = actualSelectedValues.size();
//        } else {
//            selectionDisplayRange = 3;
//        }
//        return null;
//    }

    ///// Setters & Getters ////////////////////////////////////////////////////////////////////////////////////////////


//    public void setSearchableList(List<SelectItem> actualList) {
//        searchableList = actualList;
//    }
//    
//    public List<SelectItem> getSearchableList() {
//        if (searchableList == null) {// || (keyword == null || keyword.equals("") || keyword.equals("null"))) {
//            searchableList = allEmployeesList;
//        }
//        return searchableList;
//    }
//
//    public List getSelectedValues() {
//        if (selectedValues == null) {
//            selectedValues = new ArrayList();
//        }
//        return selectedValues;
//    }
//
//    public List<SelectItem> getAllEmployeesList() {
//        return allEmployeesList;
//    }
//
//    public void setKeyword(String keyword) {
//        this.keyword = keyword;
//    }
//
//    public String getKeyword() {
//        return keyword;
//    }
//
//    public List<SelectItem> getActualSelectedValues() {
//        return actualSelectedValues;
//    }
//
//    public void setRemoveSelectedItem(SelectItem removeSelectedItem) {
//        this.removeSelectedItem = removeSelectedItem;
//    }
//
//    public SelectItem getRemoveSelectedItem() {
//        return removeSelectedItem;
//    }
//
//    public int getSelectionDisplayRange() {
//        return selectionDisplayRange;
//    }
//
//    public void setAllEmployeesList(List<SelectItem> allEmployeesList) {
//        this.allEmployeesList = allEmployeesList;
//    }
//
//    public void setSelectedValues(List selectedValues) {
//        this.selectedValues = selectedValues;
//    }
//
//    public void setActualSelectedValues(List<SelectItem> actualSelectedValues) {
//        this.actualSelectedValues = actualSelectedValues;
//    }

    public void setReturnValues(List returnValues) {
        this.returnValues = returnValues;
    }

    public List getReturnValues() {
//        returnValues = (List) JSFUtils.resolveExpression("#{attrs.returnList}");
        System.err.println("AppReturnValues > " + returnValues);
        return returnValues;
    }
}
