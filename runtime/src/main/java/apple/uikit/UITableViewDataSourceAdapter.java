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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UITableViewDataSourceAdapter 
    extends Object 
    implements UITableViewDataSource {

    
    
    
    
    
    
    
    @NotImplemented("tableView:numberOfRowsInSection:")
    public @MachineSizedSInt long getNumberOfRowsInSection(UITableView tableView, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:cellForRowAtIndexPath:")
    public UITableViewCell getCellForRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("numberOfSectionsInTableView:")
    public @MachineSizedSInt long getNumberOfSections(UITableView tableView) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:titleForHeaderInSection:")
    public String getTitleForHeader(UITableView tableView, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:titleForFooterInSection:")
    public String getTitleForFooter(UITableView tableView, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:canEditRowAtIndexPath:")
    public boolean canEditRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:canMoveRowAtIndexPath:")
    public boolean canMoveRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("sectionIndexTitlesForTableView:")
    public List<String> getSectionIndexTitles(UITableView tableView) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:sectionForSectionIndexTitle:atIndex:")
    public @MachineSizedSInt long getSectionForSectionIndexTitle(UITableView tableView, String title, @MachineSizedSInt long index) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:commitEditingStyle:forRowAtIndexPath:")
    public void commitEditingStyleForRow(UITableView tableView, @Representing("UITableViewCellEditingStyle") @MachineSizedSInt long editingStyle, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:moveRowAtIndexPath:toIndexPath:")
    public void moveRow(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath) { throw new UnsupportedOperationException(); }
    
}
