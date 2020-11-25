package Iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {

    // 信息工程学院是以List方式存放系
    List<Department> mDepartmentList;
    int index = -1; //索引

    public InfoCollegeIterator(List<Department> departmentList) {
        mDepartmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= mDepartmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return mDepartmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
