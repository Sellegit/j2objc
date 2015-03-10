package apple.uikit;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 2.0 and later.
 */

@Library("UIKit") @Mapping("UIPickerView")
public class UIPickerView 
    extends UIView 
    implements NSCoding, UITableViewDataSource {

    
    
    public UIPickerView() {}
    @Mapping("initWithFrame:")
    public UIPickerView(CGRect frame) { }
    
    
    @Mapping("dataSource")
    public native UIPickerViewDataSource getDataSource();
    @Mapping("setDataSource:")
    public native void setDataSource(UIPickerViewDataSource v);
    @Mapping("delegate")
    public native UIPickerViewDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIPickerViewDelegate v);
    @Mapping("showsSelectionIndicator")
    public native boolean showsSelectionIndicator();
    @Mapping("setShowsSelectionIndicator:")
    public native void setShowsSelectionIndicator(boolean v);
    @Mapping("numberOfComponents")
    public native @MachineSizedSInt long getNumberOfComponents();
    
    
    
    @Mapping("numberOfRowsInComponent:")
    public native @MachineSizedSInt long getNumberOfRows(@MachineSizedSInt long component);
    @Mapping("rowSizeForComponent:")
    public native CGSize getRowSize(@MachineSizedSInt long component);
    @Mapping("viewForRow:forComponent:")
    public native UIView getViewForRow(@MachineSizedSInt long row, @MachineSizedSInt long component);
    @Mapping("reloadAllComponents")
    public native void reloadAllComponents();
    @Mapping("reloadComponent:")
    public native void reloadComponent(@MachineSizedSInt long component);
    @Mapping("selectRow:inComponent:animated:")
    public native void selectRow(@MachineSizedSInt long row, @MachineSizedSInt long component, boolean animated);
    @Mapping("selectedRowInComponent:")
    public native @MachineSizedSInt long getSelectedRow(@MachineSizedSInt long component);
    @Mapping("tableView:numberOfRowsInSection:")
    public native @MachineSizedSInt long getNumberOfRowsInSection(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:cellForRowAtIndexPath:")
    public native UITableViewCell getCellForRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("numberOfSectionsInTableView:")
    public native @MachineSizedSInt long getNumberOfSections(UITableView tableView);
    @Mapping("tableView:titleForHeaderInSection:")
    public native String getTitleForHeader(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:titleForFooterInSection:")
    public native String getTitleForFooter(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:canEditRowAtIndexPath:")
    public native boolean canEditRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:canMoveRowAtIndexPath:")
    public native boolean canMoveRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("sectionIndexTitlesForTableView:")
    public native List<String> getSectionIndexTitles(UITableView tableView);
    @Mapping("tableView:sectionForSectionIndexTitle:atIndex:")
    public native @MachineSizedSInt long getSectionForSectionIndexTitle(UITableView tableView, String title, @MachineSizedSInt long index);
    @Mapping("tableView:commitEditingStyle:forRowAtIndexPath:")
    public native void commitEditingStyleForRow(UITableView tableView, @Representing("UITableViewCellEditingStyle") @MachineSizedSInt long editingStyle, NSIndexPath indexPath);
    @Mapping("tableView:moveRowAtIndexPath:toIndexPath:")
    public native void moveRow(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath);
    
}
