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
public abstract class UISearchBarDelegateAdapter 
    extends UIBarPositioningDelegateAdapter 
    implements UISearchBarDelegate {

    
    
    


    
    
    @NotImplemented("searchBarShouldBeginEditing:")
    public boolean shouldBeginEditing(UISearchBar searchBar) { throw new UnsupportedOperationException(); }
    @NotImplemented("searchBarTextDidBeginEditing:")
    public void didBeginEditing(UISearchBar searchBar) { throw new UnsupportedOperationException(); }
    @NotImplemented("searchBarShouldEndEditing:")
    public boolean shouldEndEditing(UISearchBar searchBar) { throw new UnsupportedOperationException(); }
    @NotImplemented("searchBarTextDidEndEditing:")
    public void didEndEditing(UISearchBar searchBar) { throw new UnsupportedOperationException(); }
    @NotImplemented("searchBar:textDidChange:")
    public void didChange(UISearchBar searchBar, String searchText) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("searchBar:shouldChangeTextInRange:replacementText:")
    public boolean shouldChange(UISearchBar searchBar, NSRange range, String text) { throw new UnsupportedOperationException(); }
    @NotImplemented("searchBarSearchButtonClicked:")
    public void searchButtonClicked(UISearchBar searchBar) { throw new UnsupportedOperationException(); }
    @NotImplemented("searchBarBookmarkButtonClicked:")
    public void bookmarkButtonClicked(UISearchBar searchBar) { throw new UnsupportedOperationException(); }
    @NotImplemented("searchBarCancelButtonClicked:")
    public void cancelButtonClicked(UISearchBar searchBar) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.2 and later.
     */
    @NotImplemented("searchBarResultsListButtonClicked:")
    public void resultsListButtonClicked(UISearchBar searchBar) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("searchBar:selectedScopeButtonIndexDidChange:")
    public void selectedScopeButtonIndexDidChange(UISearchBar searchBar, @MachineSizedSInt long selectedScope) { throw new UnsupportedOperationException(); }

}
