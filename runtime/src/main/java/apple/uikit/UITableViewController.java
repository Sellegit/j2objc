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

@Library("UIKit/UIKit.h") @Mapping("UITableViewController")
public class UITableViewController 
    extends UIViewController 
    implements UITableViewDelegate, UITableViewDataSource {

    
    
    public UITableViewController() {}
    @Mapping("initWithStyle:")
    public UITableViewController(@Representing("UITableViewStyle") @MachineSizedSInt long style) { }
    @Mapping("initWithNibName:bundle:")
    public UITableViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("tableView")
    public native UITableView getTableView();
    @Mapping("setTableView:")
    public native void setTableView(UITableView v);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("clearsSelectionOnViewWillAppear")
    public native boolean clearsSelectionOnViewWillAppear();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setClearsSelectionOnViewWillAppear:")
    public native void setClearsSelectionOnViewWillAppear(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("refreshControl")
    public native UIRefreshControl getRefreshControl();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setRefreshControl:")
    public native void setRefreshControl(UIRefreshControl v);
    
    
    
    @Mapping("tableView:willDisplayCell:forRowAtIndexPath:")
    public native void willDisplayCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:willDisplayHeaderView:forSection:")
    public native void willDisplayHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:willDisplayFooterView:forSection:")
    public native void willDisplayFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:didEndDisplayingCell:forRowAtIndexPath:")
    public native void didEndDisplayingCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:didEndDisplayingHeaderView:forSection:")
    public native void didEndDisplayingHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:didEndDisplayingFooterView:forSection:")
    public native void didEndDisplayingFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    @Mapping("tableView:heightForRowAtIndexPath:")
    public native @MachineSizedFloat double getHeightForRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:heightForHeaderInSection:")
    public native @MachineSizedFloat double getHeightForHeader(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:heightForFooterInSection:")
    public native @MachineSizedFloat double getHeightForFooter(UITableView tableView, @MachineSizedSInt long section);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tableView:estimatedHeightForRowAtIndexPath:")
    public native @MachineSizedFloat double getEstimatedHeightForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tableView:estimatedHeightForHeaderInSection:")
    public native @MachineSizedFloat double getEstimatedHeightForHeader(UITableView tableView, @MachineSizedSInt long section);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tableView:estimatedHeightForFooterInSection:")
    public native @MachineSizedFloat double getEstimatedHeightForFooter(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:viewForHeaderInSection:")
    public native UIView getViewForHeader(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:viewForFooterInSection:")
    public native UIView getViewForFooter(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:accessoryButtonTappedForRowWithIndexPath:")
    public native void accessoryButtonTapped(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:shouldHighlightRowAtIndexPath:")
    public native boolean shouldHighlightRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:didHighlightRowAtIndexPath:")
    public native void didHighlightRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:didUnhighlightRowAtIndexPath:")
    public native void didUnhighlightRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:willSelectRowAtIndexPath:")
    public native NSIndexPath willSelectRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("tableView:willDeselectRowAtIndexPath:")
    public native NSIndexPath willDeselectRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:didSelectRowAtIndexPath:")
    public native void didSelectRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("tableView:didDeselectRowAtIndexPath:")
    public native void didDeselectRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:editingStyleForRowAtIndexPath:")
    public native @Representing("UITableViewCellEditingStyle") @MachineSizedSInt long getEditingStyleForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    public native String getTitleForDeleteConfirmationButton(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("tableView:editActionsForRowAtIndexPath:")
    public native NSArray<UITableViewRowAction> getEditActionsForRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:shouldIndentWhileEditingRowAtIndexPath:")
    public native boolean shouldIndentWhileEditingRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:willBeginEditingRowAtIndexPath:")
    public native void willBeginEditingRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:didEndEditingRowAtIndexPath:")
    public native void didEndEditingRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
    public native NSIndexPath getTargetForMove(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath proposedDestinationIndexPath);
    @Mapping("tableView:indentationLevelForRowAtIndexPath:")
    public native @MachineSizedSInt long getIndentationLevelForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("tableView:shouldShowMenuForRowAtIndexPath:")
    public native boolean shouldShowMenuForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("tableView:canPerformAction:forRowAtIndexPath:withSender:")
    public native boolean canPerformAction(UITableView tableView, Selector action, NSIndexPath indexPath, Object sender);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("tableView:performAction:forRowAtIndexPath:withSender:")
    public native void performActionForRow(UITableView tableView, Selector action, NSIndexPath indexPath, Object sender);
    @Mapping("scrollViewDidScroll:")
    public native void didScroll(UIScrollView scrollView);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("scrollViewDidZoom:")
    public native void didZoom(UIScrollView scrollView);
    @Mapping("scrollViewWillBeginDragging:")
    public native void willBeginDragging(UIScrollView scrollView);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void willEndDragging(UIScrollView scrollView, CGPoint velocity, CGPoint targetContentOffset);
    @Mapping("scrollViewDidEndDragging:willDecelerate:")
    public native void didEndDragging(UIScrollView scrollView, boolean decelerate);
    @Mapping("scrollViewWillBeginDecelerating:")
    public native void willBeginDecelerating(UIScrollView scrollView);
    @Mapping("scrollViewDidEndDecelerating:")
    public native void didEndDecelerating(UIScrollView scrollView);
    @Mapping("scrollViewDidEndScrollingAnimation:")
    public native void didEndScrollingAnimation(UIScrollView scrollView);
    @Mapping("viewForZoomingInScrollView:")
    public native UIView getViewForZooming(UIScrollView scrollView);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("scrollViewWillBeginZooming:withView:")
    public native void willBeginZooming(UIScrollView scrollView, UIView view);
    @Mapping("scrollViewDidEndZooming:withView:atScale:")
    public native void didEndZooming(UIScrollView scrollView, UIView view, @MachineSizedFloat double scale);
    @Mapping("scrollViewShouldScrollToTop:")
    public native boolean shouldScrollToTop(UIScrollView scrollView);
    @Mapping("scrollViewDidScrollToTop:")
    public native void didScrollToTop(UIScrollView scrollView);
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
