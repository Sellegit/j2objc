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





@Library("UIKit") @Mapping("UISearchDisplayDelegate")
public interface UISearchDisplayDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayControllerWillBeginSearch:")
    void willBeginSearch(UISearchDisplayController controller);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayControllerDidBeginSearch:")
    void didBeginSearch(UISearchDisplayController controller);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayControllerWillEndSearch:")
    void willEndSearch(UISearchDisplayController controller);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayControllerDidEndSearch:")
    void didEndSearch(UISearchDisplayController controller);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayController:didLoadSearchResultsTableView:")
    void didLoadSearchResults(UISearchDisplayController controller, UITableView tableView);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayController:willUnloadSearchResultsTableView:")
    void willUnloadSearchResults(UISearchDisplayController controller, UITableView tableView);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayController:willShowSearchResultsTableView:")
    void willShowSearchResults(UISearchDisplayController controller, UITableView tableView);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayController:didShowSearchResultsTableView:")
    void didShowSearchResults(UISearchDisplayController controller, UITableView tableView);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayController:willHideSearchResultsTableView:")
    void willHideSearchResults(UISearchDisplayController controller, UITableView tableView);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayController:didHideSearchResultsTableView:")
    void didHideSearchResults(UISearchDisplayController controller, UITableView tableView);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayController:shouldReloadTableForSearchString:")
    boolean shouldReloadForSearchString(UISearchDisplayController controller, String searchString);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayController:shouldReloadTableForSearchScope:")
    boolean shouldReloadForSearchScope(UISearchDisplayController controller, @MachineSizedSInt long searchOption);
    
    /*<adapter>*/
    /*</adapter>*/
}
