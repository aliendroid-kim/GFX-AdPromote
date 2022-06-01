// Generated by view binder compiler. Do not edit!
package com.gfx.adPromote.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gfx.adPromote.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PromoteNativeBannerBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView free;

  @NonNull
  public final ImageView icDownload;

  @NonNull
  public final TextView nativeAdText;

  @NonNull
  public final TextView nativeAppDownload;

  @NonNull
  public final TextView nativeAppName;

  @NonNull
  public final LinearLayout nativeBody;

  @NonNull
  public final RelativeLayout nativeIconProgress;

  @NonNull
  public final ImageView nativeIcons;

  @NonNull
  public final RelativeLayout nativeInstall;

  @NonNull
  public final TextView nativeInstallTxt;

  @NonNull
  public final ImageView nativePreview;

  @NonNull
  public final RelativeLayout nativePreviewProgress;

  @NonNull
  public final TextView nativeRatingCount;

  @NonNull
  public final AppCompatRatingBar nativeRatingbar;

  @NonNull
  public final LinearLayout rating;

  private PromoteNativeBannerBinding(@NonNull FrameLayout rootView, @NonNull TextView free,
      @NonNull ImageView icDownload, @NonNull TextView nativeAdText,
      @NonNull TextView nativeAppDownload, @NonNull TextView nativeAppName,
      @NonNull LinearLayout nativeBody, @NonNull RelativeLayout nativeIconProgress,
      @NonNull ImageView nativeIcons, @NonNull RelativeLayout nativeInstall,
      @NonNull TextView nativeInstallTxt, @NonNull ImageView nativePreview,
      @NonNull RelativeLayout nativePreviewProgress, @NonNull TextView nativeRatingCount,
      @NonNull AppCompatRatingBar nativeRatingbar, @NonNull LinearLayout rating) {
    this.rootView = rootView;
    this.free = free;
    this.icDownload = icDownload;
    this.nativeAdText = nativeAdText;
    this.nativeAppDownload = nativeAppDownload;
    this.nativeAppName = nativeAppName;
    this.nativeBody = nativeBody;
    this.nativeIconProgress = nativeIconProgress;
    this.nativeIcons = nativeIcons;
    this.nativeInstall = nativeInstall;
    this.nativeInstallTxt = nativeInstallTxt;
    this.nativePreview = nativePreview;
    this.nativePreviewProgress = nativePreviewProgress;
    this.nativeRatingCount = nativeRatingCount;
    this.nativeRatingbar = nativeRatingbar;
    this.rating = rating;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PromoteNativeBannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PromoteNativeBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.promote_native_banner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PromoteNativeBannerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.free;
      TextView free = ViewBindings.findChildViewById(rootView, id);
      if (free == null) {
        break missingId;
      }

      id = R.id.ic_download;
      ImageView icDownload = ViewBindings.findChildViewById(rootView, id);
      if (icDownload == null) {
        break missingId;
      }

      id = R.id.native_ad_text;
      TextView nativeAdText = ViewBindings.findChildViewById(rootView, id);
      if (nativeAdText == null) {
        break missingId;
      }

      id = R.id.native_app_download;
      TextView nativeAppDownload = ViewBindings.findChildViewById(rootView, id);
      if (nativeAppDownload == null) {
        break missingId;
      }

      id = R.id.native_app_name;
      TextView nativeAppName = ViewBindings.findChildViewById(rootView, id);
      if (nativeAppName == null) {
        break missingId;
      }

      id = R.id.native_body;
      LinearLayout nativeBody = ViewBindings.findChildViewById(rootView, id);
      if (nativeBody == null) {
        break missingId;
      }

      id = R.id.native_icon_progress;
      RelativeLayout nativeIconProgress = ViewBindings.findChildViewById(rootView, id);
      if (nativeIconProgress == null) {
        break missingId;
      }

      id = R.id.native_icons;
      ImageView nativeIcons = ViewBindings.findChildViewById(rootView, id);
      if (nativeIcons == null) {
        break missingId;
      }

      id = R.id.native_install;
      RelativeLayout nativeInstall = ViewBindings.findChildViewById(rootView, id);
      if (nativeInstall == null) {
        break missingId;
      }

      id = R.id.native_install_txt;
      TextView nativeInstallTxt = ViewBindings.findChildViewById(rootView, id);
      if (nativeInstallTxt == null) {
        break missingId;
      }

      id = R.id.native_preview;
      ImageView nativePreview = ViewBindings.findChildViewById(rootView, id);
      if (nativePreview == null) {
        break missingId;
      }

      id = R.id.native_preview_progress;
      RelativeLayout nativePreviewProgress = ViewBindings.findChildViewById(rootView, id);
      if (nativePreviewProgress == null) {
        break missingId;
      }

      id = R.id.native_ratingCount;
      TextView nativeRatingCount = ViewBindings.findChildViewById(rootView, id);
      if (nativeRatingCount == null) {
        break missingId;
      }

      id = R.id.native_ratingbar;
      AppCompatRatingBar nativeRatingbar = ViewBindings.findChildViewById(rootView, id);
      if (nativeRatingbar == null) {
        break missingId;
      }

      id = R.id.rating;
      LinearLayout rating = ViewBindings.findChildViewById(rootView, id);
      if (rating == null) {
        break missingId;
      }

      return new PromoteNativeBannerBinding((FrameLayout) rootView, free, icDownload, nativeAdText,
          nativeAppDownload, nativeAppName, nativeBody, nativeIconProgress, nativeIcons,
          nativeInstall, nativeInstallTxt, nativePreview, nativePreviewProgress, nativeRatingCount,
          nativeRatingbar, rating);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}