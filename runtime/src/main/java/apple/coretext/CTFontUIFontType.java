package apple.coretext;


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


@Library("CoreText/CoreText.h")
@Mapping("CTFontUIFontType")
public final class CTFontUIFontType extends ObjCEnum {
    
    @GlobalConstant("kCTFontUIFontNone")
    public static final long UIFontNone = -1L;
    @GlobalConstant("kCTFontUIFontUser")
    public static final long UIFontUser = 0L;
    @GlobalConstant("kCTFontUIFontUserFixedPitch")
    public static final long UIFontUserFixedPitch = 1L;
    @GlobalConstant("kCTFontUIFontSystem")
    public static final long UIFontSystem = 2L;
    @GlobalConstant("kCTFontUIFontEmphasizedSystem")
    public static final long UIFontEmphasizedSystem = 3L;
    @GlobalConstant("kCTFontUIFontSmallSystem")
    public static final long UIFontSmallSystem = 4L;
    @GlobalConstant("kCTFontUIFontSmallEmphasizedSystem")
    public static final long UIFontSmallEmphasizedSystem = 5L;
    @GlobalConstant("kCTFontUIFontMiniSystem")
    public static final long UIFontMiniSystem = 6L;
    @GlobalConstant("kCTFontUIFontMiniEmphasizedSystem")
    public static final long UIFontMiniEmphasizedSystem = 7L;
    @GlobalConstant("kCTFontUIFontViews")
    public static final long UIFontViews = 8L;
    @GlobalConstant("kCTFontUIFontApplication")
    public static final long UIFontApplication = 9L;
    @GlobalConstant("kCTFontUIFontLabel")
    public static final long UIFontLabel = 10L;
    @GlobalConstant("kCTFontUIFontMenuTitle")
    public static final long UIFontMenuTitle = 11L;
    @GlobalConstant("kCTFontUIFontMenuItem")
    public static final long UIFontMenuItem = 12L;
    @GlobalConstant("kCTFontUIFontMenuItemMark")
    public static final long UIFontMenuItemMark = 13L;
    @GlobalConstant("kCTFontUIFontMenuItemCmdKey")
    public static final long UIFontMenuItemCmdKey = 14L;
    @GlobalConstant("kCTFontUIFontWindowTitle")
    public static final long UIFontWindowTitle = 15L;
    @GlobalConstant("kCTFontUIFontPushButton")
    public static final long UIFontPushButton = 16L;
    @GlobalConstant("kCTFontUIFontUtilityWindowTitle")
    public static final long UIFontUtilityWindowTitle = 17L;
    @GlobalConstant("kCTFontUIFontAlertHeader")
    public static final long UIFontAlertHeader = 18L;
    @GlobalConstant("kCTFontUIFontSystemDetail")
    public static final long UIFontSystemDetail = 19L;
    @GlobalConstant("kCTFontUIFontEmphasizedSystemDetail")
    public static final long UIFontEmphasizedSystemDetail = 20L;
    @GlobalConstant("kCTFontUIFontToolbar")
    public static final long UIFontToolbar = 21L;
    @GlobalConstant("kCTFontUIFontSmallToolbar")
    public static final long UIFontSmallToolbar = 22L;
    @GlobalConstant("kCTFontUIFontMessage")
    public static final long UIFontMessage = 23L;
    @GlobalConstant("kCTFontUIFontPalette")
    public static final long UIFontPalette = 24L;
    @GlobalConstant("kCTFontUIFontToolTip")
    public static final long UIFontToolTip = 25L;
    @GlobalConstant("kCTFontUIFontControlContent")
    public static final long UIFontControlContent = 26L;
    @GlobalConstant("kCTFontNoFontType")
    public static final long NoFontType = -1L;
    @GlobalConstant("kCTFontUserFontType")
    public static final long UserFontType = 0L;
    @GlobalConstant("kCTFontUserFixedPitchFontType")
    public static final long UserFixedPitchFontType = 1L;
    @GlobalConstant("kCTFontSystemFontType")
    public static final long SystemFontType = 2L;
    @GlobalConstant("kCTFontEmphasizedSystemFontType")
    public static final long EmphasizedSystemFontType = 3L;
    @GlobalConstant("kCTFontSmallSystemFontType")
    public static final long SmallSystemFontType = 4L;
    @GlobalConstant("kCTFontSmallEmphasizedSystemFontType")
    public static final long SmallEmphasizedSystemFontType = 5L;
    @GlobalConstant("kCTFontMiniSystemFontType")
    public static final long MiniSystemFontType = 6L;
    @GlobalConstant("kCTFontMiniEmphasizedSystemFontType")
    public static final long MiniEmphasizedSystemFontType = 7L;
    @GlobalConstant("kCTFontViewsFontType")
    public static final long ViewsFontType = 8L;
    @GlobalConstant("kCTFontApplicationFontType")
    public static final long ApplicationFontType = 9L;
    @GlobalConstant("kCTFontLabelFontType")
    public static final long LabelFontType = 10L;
    @GlobalConstant("kCTFontMenuTitleFontType")
    public static final long MenuTitleFontType = 11L;
    @GlobalConstant("kCTFontMenuItemFontType")
    public static final long MenuItemFontType = 12L;
    @GlobalConstant("kCTFontMenuItemMarkFontType")
    public static final long MenuItemMarkFontType = 13L;
    @GlobalConstant("kCTFontMenuItemCmdKeyFontType")
    public static final long MenuItemCmdKeyFontType = 14L;
    @GlobalConstant("kCTFontWindowTitleFontType")
    public static final long WindowTitleFontType = 15L;
    @GlobalConstant("kCTFontPushButtonFontType")
    public static final long PushButtonFontType = 16L;
    @GlobalConstant("kCTFontUtilityWindowTitleFontType")
    public static final long UtilityWindowTitleFontType = 17L;
    @GlobalConstant("kCTFontAlertHeaderFontType")
    public static final long AlertHeaderFontType = 18L;
    @GlobalConstant("kCTFontSystemDetailFontType")
    public static final long SystemDetailFontType = 19L;
    @GlobalConstant("kCTFontEmphasizedSystemDetailFontType")
    public static final long EmphasizedSystemDetailFontType = 20L;
    @GlobalConstant("kCTFontToolbarFontType")
    public static final long ToolbarFontType = 21L;
    @GlobalConstant("kCTFontSmallToolbarFontType")
    public static final long SmallToolbarFontType = 22L;
    @GlobalConstant("kCTFontMessageFontType")
    public static final long MessageFontType = 23L;
    @GlobalConstant("kCTFontPaletteFontType")
    public static final long PaletteFontType = 24L;
    @GlobalConstant("kCTFontToolTipFontType")
    public static final long ToolTipFontType = 25L;
    @GlobalConstant("kCTFontControlContentFontType")
    public static final long ControlContentFontType = 26L;


}
