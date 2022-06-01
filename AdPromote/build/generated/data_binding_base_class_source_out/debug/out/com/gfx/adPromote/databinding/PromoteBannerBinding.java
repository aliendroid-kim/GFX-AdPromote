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

public final class PromoteBannerBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView ad;

  @NonNull
  public final TextView appDescription;

  @NonNull
  public final TextView appDownload;

  @NonNull
  public final TextView appName;

  @NonNull
  public final RelativeLayout bannerBody;

  @NonNull
  public final RelativeLayout bannerProgress;

  @NonNull
  public final LinearLayout content1;

  @NonNull
  public final LinearLayout content2;

  @NonNull
  public final TextView free;

  @NonNull
  public final ImageView icDownload;

  @NonNull
  public final ImageView icons;

  @NonNull
  public final RelativeLayout install;

  @NonNull
  public final TextView installTxt;

  @NonNull
  public final TextView ratingCount;

  @NonNull
  public final AppCompatRatingBar ratingbar;

  private PromoteBannerBinding(@NonNull FrameLayout rootView, @NonNull TextView ad,
      @NonNull TextView appDescription, @NonNull TextView appDownload, @NonNull TextView appName,
      @NonNull RelativeLayout bannerBody, @NonNull RelativeLayout bannerProgress,
      @NonNull LinearLayout content1, @NonNull LinearLayout content2, @NonNull TextView free,
      @NonNull ImageView icDownload, @NonNull ImageView icons, @NonNull RelativeLayout install,
      @NonNull TextView installTxt, @NonNull TextView ratingCount,
      @NonNull AppCompatRatingBar ratingbar) {
    this.rootView = rootView;
    this.ad = ad;
    this.appDescription = appDescription;
    this.appDownload = appDownload;
    this.appName = appName;
    this.bannerBody = bannerBody;
    this.bannerProgress = bannerProgress;
    this.content1 = content1;
    this.content2 = content2;
    this.free = free;
    this.icDownload = icDownload;
    this.icons = icons;
    this.install = install;
    this.installTxt = installTxt;
    this.ratingCount = ratingCount;
    this.ratingbar = ratingbar;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PromoteBannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PromoteBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.promote_banner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PromoteBannerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ad;
      TextView ad = ViewBindings.findChildViewById(rootView, id);
      if (ad == null) {
        break missingId;
      }

      id = R.id.app_description;
      TextView appDescription = ViewBindings.findChildViewById(rootView, id);
      if (appDescription == null) {
        break missingId;
      }

      id = R.id.app_download;
      TextView appDownload = ViewBindings.findChildViewById(rootView, id);
      if (appDownload == null) {
        break missingId;
      }

      id = R.id.app_name;
      TextView appName = ViewBindings.findChildViewById(rootView, id);
      if (appName == null) {
        break missingId;
      }

      id = R.id.banner_body;
      RelativeLayout bannerBody = ViewBindings.findChildViewById(rootView, id);
      if (bannerBody == null) {
        break missingId;
      }

      id = R.id.banner_progress;
      RelativeLayout bannerProgress = ViewBindings.findChildViewById(rootView, id);
      if (bannerProgress == null) {
        break missingId;
      }

      id = R.id.content_1;
      LinearLayout content1 = ViewBindings.findChildViewById(rootView, id);
      if (content1 == null) {
        break missingId;
      }

      id = R.id.content_2;
      LinearLayout content2 = ViewBindings.findChildViewById(rootView, id);
      if (content2 == null) {
        break missingId;
      }

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

      id = R.id.icons;
      ImageView icons = ViewBindings.findChildViewById(rootView, id);
      if (icons == null) {
        break missingId;
      }

      id = R.id.install;
      RelativeLayout install = ViewBindings.findChildViewById(rootView, id);
      if (install == null) {
        break missingId;
      }

      id = R.id.install_txt;
      TextView installTxt = ViewBindings.findChildViewById(rootView, id);
      if (installTxt == null) {
        break missingId;
      }

      id = R.id.ratingCount;
      TextView ratingCount = ViewBindings.findChildViewById(rootView, id);
      if (ratingCount == null) {
        break missingId;
      }

      id = R.id.ratingbar;
      AppCompatRatingBar ratingbar = ViewBindings.findChildViewById(rootView, id);
      if (ratingbar == null) {
        break missingId;
      }

      return new PromoteBannerBinding((FrameLayout) rootView, ad, appDescription, appDownload,
          appName, bannerBody, bannerProgress, content1, content2, free, icDownload, icons, install,
          installTxt, ratingCount, ratingbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
