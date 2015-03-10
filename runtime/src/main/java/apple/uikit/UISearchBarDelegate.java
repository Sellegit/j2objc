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





@Library("UIKit") @Mapping("UISearchBarDelegate")
public interface UISearchBarDelegate 
    extends UIBarPositioningDelegate {

    
    
    
    
    
    @Mapping("searchBarShouldBeginEditing:")
    boolean shouldBeginEditing(UISearchBar searchBar);
    @Mapping("searchBarTextDidBeginEditing:")
    void didBeginEditing(UISearchBar searchBar);
    @Mapping("searchBarShouldEndEditing:")
    boolean shouldEndEditing(UISearchBar searchBar);
    @Mapping("searchBarTextDidEndEditing:")
    void didEndEditing(UISearchBar searchBar);
    @Mapping("searchBar:textDidChange:")
    void didChange(UISearchBar searchBar, String searchText);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("searchBar:shouldChangeTextInRange:replacementText:")
    boolean shouldChange(UISearchBar searchBar, NSRange range, String text);
    @Mapping("searchBarSearchButtonClicked:")
    void searchButtonClicked(UISearchBar searchBar);
    @Mapping("searchBarBookmarkButtonClicked:")
    void bookmarkButtonClicked(UISearchBar searchBar);
    @Mapping("searchBarCancelButtonClicked:")
    void cancelButtonClicked(UISearchBar searchBar);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("searchBarResultsListButtonClicked:")
    void resultsListButtonClicked(UISearchBar searchBar);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("searchBar:selectedScopeButtonIndexDidChange:")
    void selectedScopeButtonIndexDidChange(UISearchBar searchBar, @MachineSizedSInt long selectedScope);
    
    /*<adapter>*/
    /*</adapter>*/
}
