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


@Library("UIKit/UIKit.h") @Mapping("UITextInputTraits")
public interface UITextInputTraits 
    extends NSObjectProtocol {

    
    
    @Mapping("autocapitalizationType")
    @Representing("UITextAutocapitalizationType") long getAutocapitalizationType();
    @Mapping("setAutocapitalizationType:")
    void setAutocapitalizationType(@Representing("UITextAutocapitalizationType") long v);
    @Mapping("autocorrectionType")
    @Representing("UITextAutocorrectionType") long getAutocorrectionType();
    @Mapping("setAutocorrectionType:")
    void setAutocorrectionType(@Representing("UITextAutocorrectionType") long v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("spellCheckingType")
    @Representing("UITextSpellCheckingType") long getSpellCheckingType();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSpellCheckingType:")
    void setSpellCheckingType(@Representing("UITextSpellCheckingType") long v);
    @Mapping("keyboardType")
    @Representing("UIKeyboardType") long getKeyboardType();
    @Mapping("setKeyboardType:")
    void setKeyboardType(@Representing("UIKeyboardType") long v);
    @Mapping("keyboardAppearance")
    @Representing("UIKeyboardAppearance") long getKeyboardAppearance();
    @Mapping("setKeyboardAppearance:")
    void setKeyboardAppearance(@Representing("UIKeyboardAppearance") long v);
    @Mapping("returnKeyType")
    @Representing("UIReturnKeyType") long getReturnKeyType();
    @Mapping("setReturnKeyType:")
    void setReturnKeyType(@Representing("UIReturnKeyType") long v);
    @Mapping("enablesReturnKeyAutomatically")
    boolean enablesReturnKeyAutomatically();
    @Mapping("setEnablesReturnKeyAutomatically:")
    void setEnablesReturnKeyAutomatically(boolean v);
    @Mapping("isSecureTextEntry")
    boolean isSecureTextEntry();
    @Mapping("setSecureTextEntry:")
    void setSecureTextEntry(boolean v);

    


    /*<adapter>*/
    /*</adapter>*/
}
