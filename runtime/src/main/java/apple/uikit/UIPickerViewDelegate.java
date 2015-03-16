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





@Library("UIKit/UIKit.h") @Mapping("UIPickerViewDelegate")
public interface UIPickerViewDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("pickerView:widthForComponent:")
    @MachineSizedFloat double getComponentWidth(UIPickerView pickerView, @MachineSizedSInt long component);
    @Mapping("pickerView:rowHeightForComponent:")
    @MachineSizedFloat double getRowHeight(UIPickerView pickerView, @MachineSizedSInt long component);
    @Mapping("pickerView:titleForRow:forComponent:")
    String getRowTitle(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("pickerView:attributedTitleForRow:forComponent:")
    NSAttributedString getAttributedRowTitle(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component);
    @Mapping("pickerView:viewForRow:forComponent:reusingView:")
    UIView getRowView(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component, UIView view);
    @Mapping("pickerView:didSelectRow:inComponent:")
    void didSelectRow(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component);
    
    /*<adapter>*/
    /*</adapter>*/
}
