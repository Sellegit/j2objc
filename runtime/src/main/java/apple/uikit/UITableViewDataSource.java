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





@Library("UIKit/UIKit.h") @Mapping("UITableViewDataSource")
public interface UITableViewDataSource 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("tableView:numberOfRowsInSection:")
    @MachineSizedSInt long getNumberOfRowsInSection(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:cellForRowAtIndexPath:")
    UITableViewCell getCellForRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("numberOfSectionsInTableView:")
    @MachineSizedSInt long getNumberOfSections(UITableView tableView);
    @Mapping("tableView:titleForHeaderInSection:")
    String getTitleForHeader(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:titleForFooterInSection:")
    String getTitleForFooter(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:canEditRowAtIndexPath:")
    boolean canEditRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:canMoveRowAtIndexPath:")
    boolean canMoveRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("sectionIndexTitlesForTableView:")
    List<String> getSectionIndexTitles(UITableView tableView);
    @Mapping("tableView:sectionForSectionIndexTitle:atIndex:")
    @MachineSizedSInt long getSectionForSectionIndexTitle(UITableView tableView, String title, @MachineSizedSInt long index);
    @Mapping("tableView:commitEditingStyle:forRowAtIndexPath:")
    void commitEditingStyleForRow(UITableView tableView, @Representing("UITableViewCellEditingStyle") long editingStyle, NSIndexPath indexPath);
    @Mapping("tableView:moveRowAtIndexPath:toIndexPath:")
    void moveRow(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath);
    
    /*<adapter>*/
    /*</adapter>*/
}
