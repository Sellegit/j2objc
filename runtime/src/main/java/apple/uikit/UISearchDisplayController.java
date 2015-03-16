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
 * @since Available in iOS 3.0 and later.
 * @deprecated Deprecated in iOS 8.0.
 */
@Deprecated

@Library("UIKit/UIKit.h") @Mapping("UISearchDisplayController")
public class UISearchDisplayController 
    extends NSObject 
     {

    
    
    public UISearchDisplayController() {}
    @Mapping("initWithSearchBar:contentsController:")
    public UISearchDisplayController(UISearchBar searchBar, UIViewController viewController) { }
    
    
    @Mapping("delegate")
    public native UISearchDisplayDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UISearchDisplayDelegate v);
    @Mapping("isActive")
    public native boolean isActive();
    @Mapping("setActive:")
    public native void setActive(boolean v);
    @Mapping("searchBar")
    public native UISearchBar getSearchBar();
    @Mapping("searchContentsController")
    public native UIViewController getSearchContentsController();
    @Mapping("searchResultsTableView")
    public native UITableView getSearchResultsTableView();
    @Mapping("searchResultsDataSource")
    public native UITableViewDataSource getSearchResultsDataSource();
    @Mapping("setSearchResultsDataSource:")
    public native void setSearchResultsDataSource(UITableViewDataSource v);
    @Mapping("searchResultsDelegate")
    public native UITableViewDelegate getSearchResultsDelegate();
    @Mapping("setSearchResultsDelegate:")
    public native void setSearchResultsDelegate(UITableViewDelegate v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("searchResultsTitle")
    public native String getSearchResultsTitle();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSearchResultsTitle:")
    public native void setSearchResultsTitle(String v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("displaysSearchBarInNavigationBar")
    public native boolean displaysSearchBarInNavigationBar();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setDisplaysSearchBarInNavigationBar:")
    public native void setDisplaysSearchBarInNavigationBar(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("navigationItem")
    public native UINavigationItem getNavigationItem();
    
    
    
    @Mapping("setActive:animated:")
    public native void setActive(boolean visible, boolean animated);
    
}
