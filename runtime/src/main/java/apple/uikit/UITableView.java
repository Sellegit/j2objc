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
@Library("UIKit/UIKit.h") @Mapping("UITableView")
public class UITableView 
    extends UIScrollView 
    implements NSCoding {

    
    
    @Mapping("initWithFrame:style:")
    public UITableView(CGRect frame, @Representing("UITableViewStyle") long style) { }
    @Mapping("initWithFrame:")
    public UITableView(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UITableView(NSCoder aDecoder) { }
    @Mapping("init")
    public UITableView() { }

    
    @Mapping("style")
    public native @Representing("UITableViewStyle") long getStyle();
    @Mapping("dataSource")
    public native UITableViewDataSource getDataSource();
    @Mapping("setDataSource:")
    public native void setDataSource(UITableViewDataSource v);
    @Mapping("delegate")
    public native UITableViewDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UITableViewDelegate v);
    @Mapping("rowHeight")
    public native @MachineSizedFloat double getRowHeight();
    @Mapping("setRowHeight:")
    public native void setRowHeight(@MachineSizedFloat double v);
    @Mapping("sectionHeaderHeight")
    public native @MachineSizedFloat double getSectionHeaderHeight();
    @Mapping("setSectionHeaderHeight:")
    public native void setSectionHeaderHeight(@MachineSizedFloat double v);
    @Mapping("sectionFooterHeight")
    public native @MachineSizedFloat double getSectionFooterHeight();
    @Mapping("setSectionFooterHeight:")
    public native void setSectionFooterHeight(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("estimatedRowHeight")
    public native @MachineSizedFloat double getEstimatedRowHeight();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setEstimatedRowHeight:")
    public native void setEstimatedRowHeight(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("estimatedSectionHeaderHeight")
    public native @MachineSizedFloat double getEstimatedSectionHeaderHeight();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setEstimatedSectionHeaderHeight:")
    public native void setEstimatedSectionHeaderHeight(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("estimatedSectionFooterHeight")
    public native @MachineSizedFloat double getEstimatedSectionFooterHeight();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setEstimatedSectionFooterHeight:")
    public native void setEstimatedSectionFooterHeight(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("separatorInset")
    public native UIEdgeInsets getSeparatorInset();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setSeparatorInset:")
    public native void setSeparatorInset(UIEdgeInsets v);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("backgroundView")
    public native UIView getBackgroundView();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @Mapping("isEditing")
    public native boolean isEditing();
    @Mapping("setEditing:")
    public native void setEditing(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("allowsSelection")
    public native boolean allowsSelection();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setAllowsSelection:")
    public native void setAllowsSelection(boolean v);
    @Mapping("allowsSelectionDuringEditing")
    public native boolean allowsSelectionDuringEditing();
    @Mapping("setAllowsSelectionDuringEditing:")
    public native void setAllowsSelectionDuringEditing(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("allowsMultipleSelection")
    public native boolean allowsMultipleSelection();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("allowsMultipleSelectionDuringEditing")
    public native boolean allowsMultipleSelectionDuringEditing();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAllowsMultipleSelectionDuringEditing:")
    public native void setAllowsMultipleSelectionDuringEditing(boolean v);
    @Mapping("sectionIndexMinimumDisplayRowCount")
    public native @MachineSizedSInt long getSectionIndexMinimumDisplayRowCount();
    @Mapping("setSectionIndexMinimumDisplayRowCount:")
    public native void setSectionIndexMinimumDisplayRowCount(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("sectionIndexColor")
    public native UIColor getSectionIndexColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setSectionIndexColor:")
    public native void setSectionIndexColor(UIColor v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("sectionIndexBackgroundColor")
    public native UIColor getSectionIndexBackgroundColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setSectionIndexBackgroundColor:")
    public native void setSectionIndexBackgroundColor(UIColor v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("sectionIndexTrackingBackgroundColor")
    public native UIColor getSectionIndexTrackingBackgroundColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setSectionIndexTrackingBackgroundColor:")
    public native void setSectionIndexTrackingBackgroundColor(UIColor v);
    @Mapping("separatorStyle")
    public native @Representing("UITableViewCellSeparatorStyle") long getSeparatorStyle();
    @Mapping("setSeparatorStyle:")
    public native void setSeparatorStyle(@Representing("UITableViewCellSeparatorStyle") long v);
    @Mapping("separatorColor")
    public native UIColor getSeparatorColor();
    @Mapping("setSeparatorColor:")
    public native void setSeparatorColor(UIColor v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("separatorEffect")
    public native UIVisualEffect getSeparatorEffect();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setSeparatorEffect:")
    public native void setSeparatorEffect(UIVisualEffect v);
    @Mapping("tableHeaderView")
    public native UIView getTableHeaderView();
    @Mapping("setTableHeaderView:")
    public native void setTableHeaderView(UIView v);
    @Mapping("tableFooterView")
    public native UIView getTableFooterView();
    @Mapping("setTableFooterView:")
    public native void setTableFooterView(UIView v);

    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("UITableViewIndexSearch")
    public static native String getIndexSearch();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UITableViewAutomaticDimension")
    public static native @MachineSizedFloat double getAutomaticDimension();
    @GlobalConstant("UITableViewSelectionDidChangeNotification")
    public static native String SelectionDidChangeNotification();

    @Mapping("reloadData")
    public native void reloadData();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("reloadSectionIndexTitles")
    public native void reloadSectionIndexTitles();
    @Mapping("numberOfSections")
    public native @MachineSizedSInt long getNumberOfSections();
    @Mapping("numberOfRowsInSection:")
    public native @MachineSizedSInt long getNumberOfRowsInSection(@MachineSizedSInt long section);
    @Mapping("rectForSection:")
    public native CGRect getRectForSection(@MachineSizedSInt long section);
    @Mapping("rectForHeaderInSection:")
    public native CGRect getRectForHeaderInSection(@MachineSizedSInt long section);
    @Mapping("rectForFooterInSection:")
    public native CGRect getRectForFooterInSection(@MachineSizedSInt long section);
    @Mapping("rectForRowAtIndexPath:")
    public native CGRect getRectForRow(NSIndexPath indexPath);
    @Mapping("indexPathForRowAtPoint:")
    public native NSIndexPath getIndexPathForRow(CGPoint point);
    @Mapping("indexPathForCell:")
    public native NSIndexPath getIndexPathForCell(UITableViewCell cell);
    @Mapping("indexPathsForRowsInRect:")
    public native NSArray<NSIndexPath> getIndexPathsForRowsInRect(CGRect rect);
    @Mapping("cellForRowAtIndexPath:")
    public native UITableViewCell getCellForRow(NSIndexPath indexPath);
    @Mapping("visibleCells")
    public native NSArray<UITableViewCell> getVisibleCells();
    @Mapping("indexPathsForVisibleRows")
    public native NSArray<NSIndexPath> getIndexPathsForVisibleRows();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("headerViewForSection:")
    public native UITableViewHeaderFooterView getHeaderViewForSection(@MachineSizedSInt long section);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("footerViewForSection:")
    public native UITableViewHeaderFooterView getFooterViewForSection(@MachineSizedSInt long section);
    @Mapping("scrollToRowAtIndexPath:atScrollPosition:animated:")
    public native void scrollToRow(NSIndexPath indexPath, @Representing("UITableViewScrollPosition") long scrollPosition, boolean animated);
    @Mapping("scrollToNearestSelectedRowAtScrollPosition:animated:")
    public native void scrollToNearestSelectedRow(@Representing("UITableViewScrollPosition") long scrollPosition, boolean animated);
    @Mapping("beginUpdates")
    public native void beginUpdates();
    @Mapping("endUpdates")
    public native void endUpdates();
    @Mapping("insertSections:withRowAnimation:")
    public native void insertSections(NSIndexSet sections, @Representing("UITableViewRowAnimation") long animation);
    @Mapping("deleteSections:withRowAnimation:")
    public native void deleteSections(NSIndexSet sections, @Representing("UITableViewRowAnimation") long animation);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("reloadSections:withRowAnimation:")
    public native void reloadSections(NSIndexSet sections, @Representing("UITableViewRowAnimation") long animation);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("moveSection:toSection:")
    public native void moveSection(@MachineSizedSInt long section, @MachineSizedSInt long newSection);
    @Mapping("insertRowsAtIndexPaths:withRowAnimation:")
    public native void insertRows(NSArray<?> indexPaths, @Representing("UITableViewRowAnimation") long animation);
    @Mapping("deleteRowsAtIndexPaths:withRowAnimation:")
    public native void deleteRows(NSArray<?> indexPaths, @Representing("UITableViewRowAnimation") long animation);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("reloadRowsAtIndexPaths:withRowAnimation:")
    public native void reloadRows(NSArray<?> indexPaths, @Representing("UITableViewRowAnimation") long animation);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("moveRowAtIndexPath:toIndexPath:")
    public native void moveRow(NSIndexPath indexPath, NSIndexPath newIndexPath);
    @Mapping("setEditing:animated:")
    public native void setEditing(boolean editing, boolean animated);
    @Mapping("indexPathForSelectedRow")
    public native NSIndexPath getIndexPathForSelectedRow();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("indexPathsForSelectedRows")
    public native NSArray<NSIndexPath> getIndexPathsForSelectedRows();
    @Mapping("selectRowAtIndexPath:animated:scrollPosition:")
    public native void selectRow(NSIndexPath indexPath, boolean animated, @Representing("UITableViewScrollPosition") long scrollPosition);
    @Mapping("deselectRowAtIndexPath:animated:")
    public native void deselectRow(NSIndexPath indexPath, boolean animated);
    @Mapping("dequeueReusableCellWithIdentifier:")
    public native UITableViewCell dequeueReusableCell(String identifier);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("dequeueReusableCellWithIdentifier:forIndexPath:")
    public native UITableViewCell dequeueReusableCell(String identifier, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("dequeueReusableHeaderFooterViewWithIdentifier:")
    public native UITableViewHeaderFooterView dequeueReusableHeaderFooterView(String identifier);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("registerNib:forCellReuseIdentifier:")
    public native void registerReusableCellNib(UINib nib, String identifier);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("registerNib:forHeaderFooterViewReuseIdentifier:")
    public native void registerReusableHeaderFooterViewNib(UINib nib, String identifier);

}
