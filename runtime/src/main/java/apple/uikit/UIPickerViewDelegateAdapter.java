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
public abstract class UIPickerViewDelegateAdapter 
    extends Object 
    implements UIPickerViewDelegate {

    
    
    


    
    
    @NotImplemented("pickerView:widthForComponent:")
    public @MachineSizedFloat double getComponentWidth(UIPickerView pickerView, @MachineSizedSInt long component) { throw new UnsupportedOperationException(); }
    @NotImplemented("pickerView:rowHeightForComponent:")
    public @MachineSizedFloat double getRowHeight(UIPickerView pickerView, @MachineSizedSInt long component) { throw new UnsupportedOperationException(); }
    @NotImplemented("pickerView:titleForRow:forComponent:")
    public String getRowTitle(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("pickerView:attributedTitleForRow:forComponent:")
    public NSAttributedString getAttributedRowTitle(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component) { throw new UnsupportedOperationException(); }
    @NotImplemented("pickerView:viewForRow:forComponent:reusingView:")
    public UIView getRowView(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component, UIView view) { throw new UnsupportedOperationException(); }
    @NotImplemented("pickerView:didSelectRow:inComponent:")
    public void didSelectRow(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component) { throw new UnsupportedOperationException(); }

}
