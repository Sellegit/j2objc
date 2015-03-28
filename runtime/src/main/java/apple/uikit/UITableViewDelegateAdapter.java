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
public abstract class UITableViewDelegateAdapter 
    extends UIScrollViewDelegateAdapter 
    implements UITableViewDelegate {

    
    
    


    
    
    @NotImplemented("tableView:willDisplayCell:forRowAtIndexPath:")
    public void willDisplayCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:willDisplayHeaderView:forSection:")
    public void willDisplayHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:willDisplayFooterView:forSection:")
    public void willDisplayFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:didEndDisplayingCell:forRowAtIndexPath:")
    public void didEndDisplayingCell(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:didEndDisplayingHeaderView:forSection:")
    public void didEndDisplayingHeaderView(UITableView tableView, UIView view, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:didEndDisplayingFooterView:forSection:")
    public void didEndDisplayingFooterView(UITableView tableView, UIView view, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:heightForRowAtIndexPath:")
    public @MachineSizedFloat double getHeightForRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:heightForHeaderInSection:")
    public @MachineSizedFloat double getHeightForHeader(UITableView tableView, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:heightForFooterInSection:")
    public @MachineSizedFloat double getHeightForFooter(UITableView tableView, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("tableView:estimatedHeightForRowAtIndexPath:")
    public @MachineSizedFloat double getEstimatedHeightForRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("tableView:estimatedHeightForHeaderInSection:")
    public @MachineSizedFloat double getEstimatedHeightForHeader(UITableView tableView, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("tableView:estimatedHeightForFooterInSection:")
    public @MachineSizedFloat double getEstimatedHeightForFooter(UITableView tableView, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:viewForHeaderInSection:")
    public UIView getViewForHeader(UITableView tableView, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:viewForFooterInSection:")
    public UIView getViewForFooter(UITableView tableView, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:accessoryButtonTappedForRowWithIndexPath:")
    public void accessoryButtonTapped(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:shouldHighlightRowAtIndexPath:")
    public boolean shouldHighlightRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:didHighlightRowAtIndexPath:")
    public void didHighlightRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("tableView:didUnhighlightRowAtIndexPath:")
    public void didUnhighlightRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:willSelectRowAtIndexPath:")
    public NSIndexPath willSelectRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("tableView:willDeselectRowAtIndexPath:")
    public NSIndexPath willDeselectRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:didSelectRowAtIndexPath:")
    public void didSelectRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("tableView:didDeselectRowAtIndexPath:")
    public void didDeselectRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:editingStyleForRowAtIndexPath:")
    public @Representing("UITableViewCellEditingStyle") long getEditingStyleForRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    public String getTitleForDeleteConfirmationButton(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("tableView:editActionsForRowAtIndexPath:")
    public NSArray<UITableViewRowAction> getEditActionsForRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:shouldIndentWhileEditingRowAtIndexPath:")
    public boolean shouldIndentWhileEditingRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:willBeginEditingRowAtIndexPath:")
    public void willBeginEditingRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:didEndEditingRowAtIndexPath:")
    public void didEndEditingRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
    public NSIndexPath getTargetForMove(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath proposedDestinationIndexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("tableView:indentationLevelForRowAtIndexPath:")
    public @MachineSizedSInt long getIndentationLevelForRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("tableView:shouldShowMenuForRowAtIndexPath:")
    public boolean shouldShowMenuForRow(UITableView tableView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("tableView:canPerformAction:forRowAtIndexPath:withSender:")
    public boolean canPerformAction(UITableView tableView, Selector action, NSIndexPath indexPath, Object sender) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("tableView:performAction:forRowAtIndexPath:withSender:")
    public void performActionForRow(UITableView tableView, Selector action, NSIndexPath indexPath, Object sender) { throw new UnsupportedOperationException(); }

}
