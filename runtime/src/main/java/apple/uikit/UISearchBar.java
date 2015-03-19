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

@Library("UIKit/UIKit.h") @Mapping("UISearchBar")
public class UISearchBar 
    extends UIView 
    implements UIBarPositioning, UITextInputTraits {

    
    
    @Mapping("initWithFrame:")
    public UISearchBar(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UISearchBar(NSCoder aDecoder) { }
    @Mapping("init")
    public UISearchBar() { }
    
    
    @Mapping("barStyle")
    public native @Representing("UIBarStyle") long getBarStyle();
    @Mapping("setBarStyle:")
    public native void setBarStyle(@Representing("UIBarStyle") long v);
    @Mapping("delegate")
    public native UISearchBarDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UISearchBarDelegate v);
    @Mapping("text")
    public native String getText();
    @Mapping("setText:")
    public native void setText(String v);
    @Mapping("prompt")
    public native String getPrompt();
    @Mapping("setPrompt:")
    public native void setPrompt(String v);
    @Mapping("placeholder")
    public native String getPlaceholder();
    @Mapping("setPlaceholder:")
    public native void setPlaceholder(String v);
    @Mapping("showsBookmarkButton")
    public native boolean showsBookmarkButton();
    @Mapping("setShowsBookmarkButton:")
    public native void setShowsBookmarkButton(boolean v);
    @Mapping("showsCancelButton")
    public native boolean showsCancelButton();
    @Mapping("setShowsCancelButton:")
    public native void setShowsCancelButton(boolean v);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("showsSearchResultsButton")
    public native boolean showsSearchResultsButton();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setShowsSearchResultsButton:")
    public native void setShowsSearchResultsButton(boolean v);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("isSearchResultsButtonSelected")
    public native boolean isSearchResultsButtonSelected();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setSearchResultsButtonSelected:")
    public native void setSearchResultsButtonSelected(boolean v);
    @Mapping("tintColor")
    public native UIColor getTintColor();
    @Mapping("setTintColor:")
    public native void setTintColor(UIColor v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("barTintColor")
    public native UIColor getBarTintColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setBarTintColor:")
    public native void setBarTintColor(UIColor v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("searchBarStyle")
    public native @Representing("UISearchBarStyle") long getSearchBarStyle();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setSearchBarStyle:")
    public native void setSearchBarStyle(@Representing("UISearchBarStyle") long v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isTranslucent")
    public native boolean isTranslucent();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setTranslucent:")
    public native void setTranslucent(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("scopeButtonTitles")
    public native List<String> getScopeButtonTitles();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setScopeButtonTitles:")
    public native void setScopeButtonTitles(List<String> v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("selectedScopeButtonIndex")
    public native @MachineSizedSInt long getSelectedScopeButtonIndex();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setSelectedScopeButtonIndex:")
    public native void setSelectedScopeButtonIndex(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("showsScopeBar")
    public native boolean showsScopeBar();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setShowsScopeBar:")
    public native void setShowsScopeBar(boolean v);
    @Mapping("inputAccessoryView")
    public native UIView getInputAccessoryView();
    @Mapping("setInputAccessoryView:")
    public native void setInputAccessoryView(UIView v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("backgroundImage")
    public native UIImage getBackgroundImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setBackgroundImage:")
    public native void setBackgroundImage(UIImage v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("scopeBarBackgroundImage")
    public native UIImage getScopeBarBackgroundImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setScopeBarBackgroundImage:")
    public native void setScopeBarBackgroundImage(UIImage v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("searchFieldBackgroundPositionAdjustment")
    public native UIOffset getSearchFieldBackgroundPositionAdjustment();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSearchFieldBackgroundPositionAdjustment:")
    public native void setSearchFieldBackgroundPositionAdjustment(UIOffset v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("searchTextPositionAdjustment")
    public native UIOffset getSearchTextPositionAdjustment();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSearchTextPositionAdjustment:")
    public native void setSearchTextPositionAdjustment(UIOffset v);
    @Mapping("barPosition")
    public native @Representing("UIBarPosition") long getBarPosition();
    @Mapping("autocapitalizationType")
    public native @Representing("UITextAutocapitalizationType") long getAutocapitalizationType();
    @Mapping("setAutocapitalizationType:")
    public native void setAutocapitalizationType(@Representing("UITextAutocapitalizationType") long v);
    @Mapping("autocorrectionType")
    public native @Representing("UITextAutocorrectionType") long getAutocorrectionType();
    @Mapping("setAutocorrectionType:")
    public native void setAutocorrectionType(@Representing("UITextAutocorrectionType") long v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("spellCheckingType")
    public native @Representing("UITextSpellCheckingType") long getSpellCheckingType();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSpellCheckingType:")
    public native void setSpellCheckingType(@Representing("UITextSpellCheckingType") long v);
    @Mapping("keyboardType")
    public native @Representing("UIKeyboardType") long getKeyboardType();
    @Mapping("setKeyboardType:")
    public native void setKeyboardType(@Representing("UIKeyboardType") long v);
    @Mapping("keyboardAppearance")
    public native @Representing("UIKeyboardAppearance") long getKeyboardAppearance();
    @Mapping("setKeyboardAppearance:")
    public native void setKeyboardAppearance(@Representing("UIKeyboardAppearance") long v);
    @Mapping("returnKeyType")
    public native @Representing("UIReturnKeyType") long getReturnKeyType();
    @Mapping("setReturnKeyType:")
    public native void setReturnKeyType(@Representing("UIReturnKeyType") long v);
    @Mapping("enablesReturnKeyAutomatically")
    public native boolean enablesReturnKeyAutomatically();
    @Mapping("setEnablesReturnKeyAutomatically:")
    public native void setEnablesReturnKeyAutomatically(boolean v);
    @Mapping("isSecureTextEntry")
    public native boolean isSecureTextEntry();
    @Mapping("setSecureTextEntry:")
    public native void setSecureTextEntry(boolean v);
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setShowsCancelButton:animated:")
    public native void setShowsCancelButton(boolean showsCancelButton, boolean animated);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setBackgroundImage:forBarPosition:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, @Representing("UIBarPosition") long barPosition, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("backgroundImageForBarPosition:barMetrics:")
    public native UIImage getBackgroundImage(@Representing("UIBarPosition") long barPosition, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSearchFieldBackgroundImage:forState:")
    public native void setSearchFieldBackgroundImage(UIImage backgroundImage, @Representing("UIControlState") long state);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("searchFieldBackgroundImageForState:")
    public native UIImage getSearchFieldBackgroundImage(@Representing("UIControlState") long state);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setImage:forSearchBarIcon:state:")
    public native void setImageForSearchBarIcon(UIImage iconImage, @Representing("UISearchBarIcon") long icon, @Representing("UIControlState") long state);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("imageForSearchBarIcon:state:")
    public native UIImage getImageForSearchBarIcon(@Representing("UISearchBarIcon") long icon, @Representing("UIControlState") long state);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setScopeBarButtonBackgroundImage:forState:")
    public native void setScopeBarButtonBackgroundImage(UIImage backgroundImage, @Representing("UIControlState") long state);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("scopeBarButtonBackgroundImageForState:")
    public native UIImage getScopeBarButtonBackgroundImage(@Representing("UIControlState") long state);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setScopeBarButtonDividerImage:forLeftSegmentState:rightSegmentState:")
    public native void setScopeBarButtonDividerImage(UIImage dividerImage, @Representing("UIControlState") long leftState, @Representing("UIControlState") long rightState);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("scopeBarButtonDividerImageForLeftSegmentState:rightSegmentState:")
    public native UIImage getScopeBarButtonDividerImage(@Representing("UIControlState") long leftState, @Representing("UIControlState") long rightState);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setScopeBarButtonTitleTextAttributes:forState:")
    public native void setScopeBarButtonTitleTextAttributes(NSDictionary<?, ?> attributes, @Representing("UIControlState") long state);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("scopeBarButtonTitleTextAttributesForState:")
    public native NSDictionary<?, ?> getScopeBarButtonTitleTextAttributes(@Representing("UIControlState") long state);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setPositionAdjustment:forSearchBarIcon:")
    public native void setPositionAdjustmentForSearchBarIcon(UIOffset adjustment, @Representing("UISearchBarIcon") long icon);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("positionAdjustmentForSearchBarIcon:")
    public native UIOffset getPositionAdjustmentForSearchBarIcon(@Representing("UISearchBarIcon") long icon);
    
}
