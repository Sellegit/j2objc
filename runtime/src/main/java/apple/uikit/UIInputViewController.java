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
 * @since Available in iOS 8.0 and later.
 */

@Library("UIKit") @Mapping("UIInputViewController")
public class UIInputViewController 
    extends UIViewController 
    implements UITextInputDelegate {

    
    
    public UIInputViewController() {}
    @Mapping("initWithNibName:bundle:")
    public UIInputViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("inputView")
    public native UIInputView getInputView();
    @Mapping("setInputView:")
    public native void setInputView(UIInputView v);
    @Mapping("textDocumentProxy")
    public native UITextDocumentProxy getTextDocumentProxy();
    @Mapping("primaryLanguage")
    public native String getPrimaryLanguage();
    @Mapping("setPrimaryLanguage:")
    public native void setPrimaryLanguage(String v);
    
    
    
    @Mapping("dismissKeyboard")
    public native void dismissKeyboard();
    @Mapping("advanceToNextInputMode")
    public native void advanceToNextInputMode();
    @Mapping("requestSupplementaryLexiconWithCompletion:")
    public native void requestSupplementaryLexicon(@Block VoidBlock1<UILexicon> completionHandler);
    @Mapping("selectionWillChange:")
    public native void selectionWillChange(UITextInput textInput);
    @Mapping("selectionDidChange:")
    public native void selectionDidChange(UITextInput textInput);
    @Mapping("textWillChange:")
    public native void textWillChange(UITextInput textInput);
    @Mapping("textDidChange:")
    public native void textDidChange(UITextInput textInput);
    
}
