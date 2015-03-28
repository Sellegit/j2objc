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


@Library("UIKit/UIKit.h") @Mapping("UITableViewDelegate")
public interface UITableViewDelegate 
    extends NSObjectProtocol, UIScrollViewDelegate {

    
    


    
    @Mapping("tableView:willDisplayCell:forRowAtIndexPath:")
    void willDisplayCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:willDisplayHeaderView:forSection:")
    void willDisplayHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:willDisplayFooterView:forSection:")
    void willDisplayFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:didEndDisplayingCell:forRowAtIndexPath:")
    void didEndDisplayingCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:didEndDisplayingHeaderView:forSection:")
    void didEndDisplayingHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:didEndDisplayingFooterView:forSection:")
    void didEndDisplayingFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section);
    @Mapping("tableView:heightForRowAtIndexPath:")
    @MachineSizedFloat double getHeightForRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:heightForHeaderInSection:")
    @MachineSizedFloat double getHeightForHeader(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:heightForFooterInSection:")
    @MachineSizedFloat double getHeightForFooter(UITableView tableView, @MachineSizedSInt long section);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tableView:estimatedHeightForRowAtIndexPath:")
    @MachineSizedFloat double getEstimatedHeightForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tableView:estimatedHeightForHeaderInSection:")
    @MachineSizedFloat double getEstimatedHeightForHeader(UITableView tableView, @MachineSizedSInt long section);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tableView:estimatedHeightForFooterInSection:")
    @MachineSizedFloat double getEstimatedHeightForFooter(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:viewForHeaderInSection:")
    UIView getViewForHeader(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:viewForFooterInSection:")
    UIView getViewForFooter(UITableView tableView, @MachineSizedSInt long section);
    @Mapping("tableView:accessoryButtonTappedForRowWithIndexPath:")
    void accessoryButtonTapped(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:shouldHighlightRowAtIndexPath:")
    boolean shouldHighlightRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:didHighlightRowAtIndexPath:")
    void didHighlightRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tableView:didUnhighlightRowAtIndexPath:")
    void didUnhighlightRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:willSelectRowAtIndexPath:")
    NSIndexPath willSelectRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("tableView:willDeselectRowAtIndexPath:")
    NSIndexPath willDeselectRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:didSelectRowAtIndexPath:")
    void didSelectRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("tableView:didDeselectRowAtIndexPath:")
    void didDeselectRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:editingStyleForRowAtIndexPath:")
    @Representing("UITableViewCellEditingStyle") long getEditingStyleForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    String getTitleForDeleteConfirmationButton(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("tableView:editActionsForRowAtIndexPath:")
    NSArray<UITableViewRowAction> getEditActionsForRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:shouldIndentWhileEditingRowAtIndexPath:")
    boolean shouldIndentWhileEditingRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:willBeginEditingRowAtIndexPath:")
    void willBeginEditingRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:didEndEditingRowAtIndexPath:")
    void didEndEditingRow(UITableView tableView, NSIndexPath indexPath);
    @Mapping("tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
    NSIndexPath getTargetForMove(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath proposedDestinationIndexPath);
    @Mapping("tableView:indentationLevelForRowAtIndexPath:")
    @MachineSizedSInt long getIndentationLevelForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("tableView:shouldShowMenuForRowAtIndexPath:")
    boolean shouldShowMenuForRow(UITableView tableView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("tableView:canPerformAction:forRowAtIndexPath:withSender:")
    boolean canPerformAction(UITableView tableView, Selector action, NSIndexPath indexPath, Object sender);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("tableView:performAction:forRowAtIndexPath:withSender:")
    void performActionForRow(UITableView tableView, Selector action, NSIndexPath indexPath, Object sender);

    /*<adapter>*/
    /*</adapter>*/
}
