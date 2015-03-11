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





@Library("UIKit") @Mapping("UITextInputTraits")
public interface UITextInputTraits 
    extends NSObjectProtocol {

    
    
    @Mapping("autocapitalizationType")
    @Representing("UITextAutocapitalizationType") @MachineSizedSInt long getAutocapitalizationType();
    @Mapping("setAutocapitalizationType:")
    void setAutocapitalizationType(@Representing("UITextAutocapitalizationType") @MachineSizedSInt long v);
    @Mapping("autocorrectionType")
    @Representing("UITextAutocorrectionType") @MachineSizedSInt long getAutocorrectionType();
    @Mapping("setAutocorrectionType:")
    void setAutocorrectionType(@Representing("UITextAutocorrectionType") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("spellCheckingType")
    @Representing("UITextSpellCheckingType") @MachineSizedSInt long getSpellCheckingType();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSpellCheckingType:")
    void setSpellCheckingType(@Representing("UITextSpellCheckingType") @MachineSizedSInt long v);
    @Mapping("keyboardType")
    @Representing("UIKeyboardType") @MachineSizedSInt long getKeyboardType();
    @Mapping("setKeyboardType:")
    void setKeyboardType(@Representing("UIKeyboardType") @MachineSizedSInt long v);
    @Mapping("keyboardAppearance")
    @Representing("UIKeyboardAppearance") @MachineSizedSInt long getKeyboardAppearance();
    @Mapping("setKeyboardAppearance:")
    void setKeyboardAppearance(@Representing("UIKeyboardAppearance") @MachineSizedSInt long v);
    @Mapping("returnKeyType")
    @Representing("UIReturnKeyType") @MachineSizedSInt long getReturnKeyType();
    @Mapping("setReturnKeyType:")
    void setReturnKeyType(@Representing("UIReturnKeyType") @MachineSizedSInt long v);
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
