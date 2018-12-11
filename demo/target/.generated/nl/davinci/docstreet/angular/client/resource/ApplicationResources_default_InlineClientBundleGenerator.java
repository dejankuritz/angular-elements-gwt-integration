package nl.davinci.docstreet.angular.client.resource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ApplicationResources_default_InlineClientBundleGenerator implements nl.davinci.docstreet.angular.client.resource.ApplicationResources {
  private static ApplicationResources_default_InlineClientBundleGenerator _instance0 = new ApplicationResources_default_InlineClientBundleGenerator();
  private void addIconInitializer() {
    addIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "addIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 24, 24, false, false
    );
  }
  private static class addIconInitializer {
    static {
      _instance0.addIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return addIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource addIcon() {
    return addIconInitializer.get();
  }
  private void clearIconInitializer() {
    clearIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "clearIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 24, 24, false, false
    );
  }
  private static class clearIconInitializer {
    static {
      _instance0.clearIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return clearIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource clearIcon() {
    return clearIconInitializer.get();
  }
  private void deleteIconInitializer() {
    deleteIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "deleteIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 24, 24, false, false
    );
  }
  private static class deleteIconInitializer {
    static {
      _instance0.deleteIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return deleteIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource deleteIcon() {
    return deleteIconInitializer.get();
  }
  private void loadIconInitializer() {
    loadIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "loadIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 24, 24, false, false
    );
  }
  private static class loadIconInitializer {
    static {
      _instance0.loadIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return loadIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource loadIcon() {
    return loadIconInitializer.get();
  }
  private void storeIconInitializer() {
    storeIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "storeIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 24, 24, false, false
    );
  }
  private static class storeIconInitializer {
    static {
      _instance0.storeIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return storeIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource storeIcon() {
    return storeIconInitializer.get();
  }
  private void warningIconInitializer() {
    warningIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "warningIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage4),
      0, 0, 24, 24, false, false
    );
  }
  private static class warningIconInitializer {
    static {
      _instance0.warningIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return warningIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource warningIcon() {
    return warningIconInitializer.get();
  }
  private void styleInitializer() {
    style = new nl.davinci.docstreet.angular.client.resource.GwtWebAppStyles() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GOXDCFRFI{font-family:" + ("arial"+ ","+ " " +"sans-serif")  + ";font-weight:" + ("bold")  + ";font-size:" + ("1em")  + ";padding:" + ("2px")  + ";}.GOXDCFRII{position:" + ("relative")  + ";float:" + ("center")  + ";margin:" + ("20px")  + ";border-radius:" + ("10px")  + ";background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#faf9f5")  + ";margin-right:" + ("auto")  + ";padding:") + (("20px")  + ";margin-left:" + ("auto")  + ";width:" + ("50%")  + ";}.GOXDCFRGI{position:" + ("relative")  + ";float:" + ("center")  + ";margin:" + ("20px")  + ";border-radius:" + ("10px")  + ";background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#e5ecf9")  + ";margin-right:" + ("auto")  + ";padding:" + ("20px")  + ";margin-left:" + ("auto") ) + (";width:" + ("50%")  + ";}.GOXDCFRHI{font-family:" + ("arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("15px")  + ";height:" + ("40px")  + ";margin:" + ("7px"+ " " +"7px")  + ";padding:" + ("0"+ " " +"5px")  + ";color:" + ("#666")  + ";min-width:" + ("48px")  + ";text-align:" + ("center")  + ";}.GOXDCFREI{font-family:" + ("arial"+ ","+ " " +"sans-serif")  + ";font-size:") + (("11px")  + ";font-weight:" + ("bold")  + ";height:" + ("40px")  + ";margin:" + ("7px"+ " " +"7px")  + ";padding:" + ("0"+ " " +"5px")  + ";background-color:" + ("#f5f5f5")  + ";border:" + ("1px"+ " " +"solid"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.1" + ")")  + ";border-radius:" + ("3px")  + ";color:" + ("#666")  + ";cursor:" + ("pointer")  + ";min-width:" + ("48px") ) + (";text-align:" + ("center")  + ";}.GOXDCFREI:hover{font-family:" + ("arial"+ ","+ " " +"sans-serif")  + ";background-color:" + ("#f8f8f8")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#c6c6c6")  + ";box-shadow:" + ("0"+ " " +"1px"+ " " +"1px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.1" + ")")  + ";color:" + ("#333")  + ";}.GOXDCFREI:focus{border:" + ("1px"+ " " +"solid"+ " " +"#4d90fe")  + ";outline:" + ("medium"+ " " +"none")  + ";}")) : ((".GOXDCFRFI{font-family:" + ("arial"+ ","+ " " +"sans-serif")  + ";font-weight:" + ("bold")  + ";font-size:" + ("1em")  + ";padding:" + ("2px")  + ";}.GOXDCFRII{position:" + ("relative")  + ";float:" + ("center")  + ";margin:" + ("20px")  + ";border-radius:" + ("10px")  + ";background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#faf9f5")  + ";margin-left:" + ("auto")  + ";padding:") + (("20px")  + ";margin-right:" + ("auto")  + ";width:" + ("50%")  + ";}.GOXDCFRGI{position:" + ("relative")  + ";float:" + ("center")  + ";margin:" + ("20px")  + ";border-radius:" + ("10px")  + ";background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0"+ " " +"#e5ecf9")  + ";margin-left:" + ("auto")  + ";padding:" + ("20px")  + ";margin-right:" + ("auto") ) + (";width:" + ("50%")  + ";}.GOXDCFRHI{font-family:" + ("arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("15px")  + ";height:" + ("40px")  + ";margin:" + ("7px"+ " " +"7px")  + ";padding:" + ("0"+ " " +"5px")  + ";color:" + ("#666")  + ";min-width:" + ("48px")  + ";text-align:" + ("center")  + ";}.GOXDCFREI{font-family:" + ("arial"+ ","+ " " +"sans-serif")  + ";font-size:") + (("11px")  + ";font-weight:" + ("bold")  + ";height:" + ("40px")  + ";margin:" + ("7px"+ " " +"7px")  + ";padding:" + ("0"+ " " +"5px")  + ";background-color:" + ("#f5f5f5")  + ";border:" + ("1px"+ " " +"solid"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.1" + ")")  + ";border-radius:" + ("3px")  + ";color:" + ("#666")  + ";cursor:" + ("pointer")  + ";min-width:" + ("48px") ) + (";text-align:" + ("center")  + ";}.GOXDCFREI:hover{font-family:" + ("arial"+ ","+ " " +"sans-serif")  + ";background-color:" + ("#f8f8f8")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#c6c6c6")  + ";box-shadow:" + ("0"+ " " +"1px"+ " " +"1px"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.1" + ")")  + ";color:" + ("#333")  + ";}.GOXDCFREI:focus{border:" + ("1px"+ " " +"solid"+ " " +"#4d90fe")  + ";outline:" + ("medium"+ " " +"none")  + ";}"));
      }
      public java.lang.String sendButton() {
        return "GOXDCFREI";
      }
      public java.lang.String simpleText() {
        return "GOXDCFRFI";
      }
      public java.lang.String todoPanel() {
        return "GOXDCFRGI";
      }
      public java.lang.String todoText() {
        return "GOXDCFRHI";
      }
      public java.lang.String todoblock() {
        return "GOXDCFRII";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static nl.davinci.docstreet.angular.client.resource.GwtWebAppStyles get() {
      return style;
    }
  }
  public nl.davinci.docstreet.angular.client.resource.GwtWebAppStyles style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAADD0lEQVR42q2Va0hTYRjHny9+EPoQhQXRBzGyL30IJ5mUuTNtappkgWVYSqbirbyRCeEVdbh525ym5bzM7KJlmZo0FWzz0jYVM2+VujVvmGYFhjnx6RyD1L2S5XzhxzmH8zz/34f3Oe8B+MviloNLaD2rN0LGwgiZFUFw/ZHP3DK4CFtdjlKIlutKf35Zfoazy1UEqqn7yJVCwpYFp6QQ06wV6ieWcnF8KYugfUpsnMCxFG410QLtYg5qFgUErZO5xgtkmmz98EIWflxIJ5CPC40XvKIFg/MCHJhPI2gZ+weB7WMwdZKCFb2hbEM4ZVDYMMJfevudhz3fkgmadJlI71PJRr3cEmAx2cChw2Oa7MeEai/MVHmsQ6B0w5YJHqrnklE1F0+gmOLRNa5EH5N1s9F+nKIlzCiyxZ1+2D0nxo7ZlHW0zyRh20wiKmZub0jbTMJKjWEfkyXuuoZM9oogR3UZW6d52DQZsy0optMwR+W9KhB0eGK9Lhqfa4OwThdO30f9N3W6SKz5FIJPNX5Yow1Bfsf5VUFqmxtKhjxQ1HcC7/Q7omTQHaXvvfDBsA8+GvHHqtEQrNaE0dxYuT6hnytHAun3vlj+4RIWD53Dgn4nzO2zQ+E7WywaPINM5h9BUutpFPZyMbnz8LbAZCW1uq4KEuTOmN5FYWy75bbAZCXIXVYFQmUg1o6mY8VQ1DpKBoKRp3bASLkFRrw2J0hRs7G4P4joY7JEqsDfAqoIDlF3QeYgAQ1HAtq10F/yXIbSezm0+QAGNO4jEKi8kK75ati3klUEjUw2sArAxCYZDtokAnUsHhzXQhXCvfyu60v+MnO80mBGIOoKRE4hlBn2MVlH48GSyd70LBJ3hul9Xu7HC7W7CLLV/sYfdiJ1iN7zxR50r95BkKH0M16QowrWn63ejc6VpgT8N1eNF2Qrg/QuVTuRemhCwOvwNU7AKYbw4u64H3ylP6a1+xCU9sTp6Z9+7JYFbBFYU3kgYeeB/GQeKAyhp6yCyofjWxawAsDELhXMrOPBYiNsUmDvZqP4C0R+qaKpDC+2AAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAD6ElEQVR42u1V20+adxhu968sabKks3UgoqHaNS5d1DGkQEtRtKgoBzkIfCAC34ecUQ6itlW72Dm1Hutsbbxfsosla9K7eZgL1sOdXmq8cM9e2NQsttbd7aJv8suP78DzvO/7PO/vu3TpY/zv4yqP9+nnvCJPAV/AnreuC4TsF8JSll8qYoWisk6h6MviD4Jfuya4UsATvKyukR61GNrQajy7dG0m6M0WGC1WtFnbYbbZIVMqj0S3bnnOB+cViwqLS3+RKVUYHZ/A2LNJjIz+gO/HxvFsahqTMzOYmp3F9OwcJianMD4xgZm5OcwvLCAQCqOispJ7PzifX0jgr+UEHk+kMPB4EL39A1h89QqPBgfp+jGejIzgu6dPMTj8BEPDw3i5uIhHQ0MYHRsD29WFSonk3QRXCwX8Al7RTxK5gl4MIJZIIt6TwNLSEg4PD7GysoLevn4k0mkk073oGxjA6uoqDg4OsPDiBfoePoSHZSFRyM4SXC8uriSRfhNLZXB5vHD7WHg4Dh1eL3ozGWxtbSEXG2/fEkkfMv392NjYyN/7fX09/06suxuuTjfu1db+i+ByUcmN8pIbZWvfSO/kxTO122Cx29HOMLA5nSSeDYlkEnt7e3nALAFn/wHf3t5GTzIBn59DKBoB0+GCWqM5JSgqKysrKS9/XSWpgbqxEY2trWjW6dFiMJBL2mAwmcglFujpd4Yy393dxXHkwJPpFJxuF7ysj0hYOFwMtK3aUwJRRcXNm1/dfvN1dTW+lcmgUKlwX61G3YMG1Ddq8EDbjKYWLRq1WkRiMWxubp4QZDeyiMVjVKEVNsYOq53saqEOWEynBCzLfnK7qqqiUiz+o0oigfiOFFKFAnLlPeolkdWroaqvowzZEx12dnZOKslms/BxPuiMepjbzXkSO2M/I/JlsVwqrrkrX5UR8F3VfSjragmYwNV1YEnsdRLyGDyXdYZEPSZZXl4m/weoChuJ7ITb43q3TVUqlVClVv+s1jSgoUkDjbaJem/AAg1QzqZra2t5IKPZCLPVjCSJu7W1if39fUxPT6PT6yZ7e+EP+N4/aJoWDb+5tfmNVt9CjtIRgR4OpwPzP84jFA7BQm1gOhz5TBmnneyZxvPnc1SlF11BlpwUQCgS4M49KnRtunKDxfCr2WYmVzjIJU7qs5d08FAFfgIIIhIPke8jCEeD+T3WHaah/HuPxELcBw87hmE+o0yXvFznn4FwV+5P6E5EkUh1I9WbpGFL0bCl8ns6k6B7PfQsniM7isbDngsd1yzbcYVK93N+X9Af4IKUfZDKDxLZeYuLRoOlF/4m5Gz8X1fOlR+/pheKvwCxqd+zyb07EgAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAErElEQVR42p2W61NUZRzHzz/QFMj9usBeuCyiiJdIjS7GVGpmRsp1F4ESZLksDHKRIi/ZXYsmZ5rpnbDpC5vRsaBJUikz04khR8OKy4JcZM857NljZTN9+z3PLsvuMvSiZ+Yzs3Oe72XP7zx7ZgWBlmLebVPMpVDKy/43TkaZB5MZcyazjWULc2azzdVWh3ud7f/Nh/sX8wGjzZ9jrRylpQaiyWRjBYuM6htNcNVWLmlWj7VAPbqA61ADXO21UN9v9kMqMUGQd5eSuXXBfLgRzl1FcL5YAKXq5YWgADPnvX1wHbS69YTrQD3Ud5vcvNMEsdQMQaKCeQMTyzuLcO+j47jfdxEylTgrK3iQ1+gxM1yv13G90tjCPfLOQrg66E7eauQ4zHQHrIWZlFYLJBKonccxv/7quwBxRz6c1kqobzd6jQzXa7WQXiqEs6EZ/7hUrmdeds31ag3UI1bcNVHBLLUws0KGWdqUfAxs/Ukls1Qy10glRxo4SnsN1yo+X8ZXK1eWQT1UhxlTCYQZalHfnDdaMJNXAId1n1/JH2ScfmEXZOseKG3VXDPX+bFf+LxGLKeRH6jlTJVQwTS1qIfrPdTBSQGTFCAFBNyjgDsUwJCX2Jsto3F3WGh8biaLiyFMUot6sM7bynA2V2E8Lx+OgCDpk0/hONrpd81F4Xb2zS3ldFSrib1eJoqKIExQC2v1bVasxRCLt2IobQUmahqw1JJsp3DLkIGZ7blQaujhtlX5UAl7IRXYqYU3N1fAWbGNjuZGyNuzOTO5qzEYk4CxGuui8In9HRiI0GA8OwPy1nXEWsjbsukVsQVKA712ml/BaEEBhJG8PDjNmyE//zAJGCR+zs1Y9nJcC4+HncIC14jFyvemHlsJ6dnVbp7JcvN0Fubyc/H7jh0Qbuh0vF3awlgDabObkXXpuBIWh7s0hqXWb5Z6XI2kko0ZkJ5a5WZTppsnMzGYmARhMEnr18z4NTMF/WGxmLad9Ascqq7j+K7b1fW4HBGHyex0SOxuGDkrOD9pEiEMJCb6NQ8YtPgmNBpT3f7hNyn4Ungs35sM2Lvl2buzOg3i+gyIjzBovHEJEK5rErzN13WJ+CokCne6P/ML+HlvLfrCojGRlYbbRgPXTARovs/ZhPOkGV+ZAnFtOsQ16bgaGw/hx3gNpA0ZPPxccATGuxaM9+U5DFRZ0BMaifEVHiPxS7KOa+1dNq/2b9L2P/oEekIiYTcmQ1xpxJVoKrhCLcxkp4CzyyJwrbLaEy6jb8Pj/Bo3rDJCzDRyI+OmNgmfB4Vh9MRCCfOepeJhvQ6iMRXfRcZCuBwd5zWPpRlwmkw/7NmL3vU5/PNYih5iBs12eSrEdA9GN99GxuDUgyEYPtHNPacfokIthScncy6Fx0DopxZf8yi1nyQTY5SOsJhKo0mZJ9lrdhgIfTIuhEWh64FlXD+iSYJDayD0cCTp6UBEQfiaBIHmITpewwkk1pNY50Fr8DM7Ej0k6HGRgobpF+/Q6OCIJ+IYWvTQuITzoVG2G7GaJc0cZgwwO2J9iFnMYHgcK3D/szgXHG4j0EsPtDd4gR665iXIny+X4AviDD2LM0GhPPxfPZAWPP1+Fh8AAAAASUVORK5CYII=";
  private static final java.lang.String externalImage2 = "data:image/png;base64,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";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAChklEQVR42u3VPUwTYRjA8Yd+UQYOzNEGCrFEXYjGxGjC4A1EiSh+gVoV8aOWtNZCSakFmhZ6QClw1PJVWqRoKVIgNRUlERUjaKLGGBYcZNBFE+NA4seAnEyPZdDFI7EHm77JLzfcXf7J+17uAfi/+K5LXthVG9rwyRXdhK7oZk70qGJJ3wuVvAK6LqB801vZJwuHcGZhH6fx+XzUd0MD70D7Q5Id+0Dg8HvgFJxToq6Tb+AqUG2TJHvzHYHBt8Dp+mws4OEZ0LQB5Zog2cF5AgfeAKf+l0rUMDwD55qBahon2YHXBPbNASffcyWqXWsIOCIk2zdLYM8r4NQ9o8TzTp6BEhooe5hkvS8I9DwDTh2PlHiG5huwA2UdItnOpwQy08DJPanE03VxBIprIOeEBfJWlNgERuugfJmZSkbnfeDETGRjSZ0w9Oud4xbYfsAIiasGYg9o1XTKR2doNzJjFLbe3YhNE4nouAOcmHtZ2DK2A9tH96LWJf+qqgF7KQ3EqgFVFSRdqE+ttAdyPvsf52LD7WS0RRJigJMjKsWuB9tikZ14sVHWUmSC1L/ZqYTDRlCXd6R9a4xkoXVEipZh+ENNWIANkXQ0+zMWT9WKPXEdME2D4FiVqM7gTvtSH87EK0ERmm7Ab+agEOtH5GjqUXw/WZ3UG9t3WdxfUakRiKOVomZdK7loH85EY78IK65B7CpAa0iGpt5MLDZJhgoNkM77l63TgbhAA7YyZxpbHVBguU+CloAcDe6MH0fKJZGV+2ueC3lqkB7Ui72aRtmS2a/Ay0zGclGF9NZ+PWSv2/DJU0F6gVYYUDvky4VayVRBGWwBhIR1nXC5pUDsOQuWfB2k/Fuz/ScLyKVSWylpXgAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage4 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAE4ElEQVR42rVVe1BUVRw+u5eVXRdC3A0VEkE0MlDGTEMzBrEm20HHFwpNjLfMVzX2sKbBB4RjCgiIu+sayENDEEFQSYFUHmGg01RTzTSONSU6OLSAZ2XvLvti79fZXac/mpzU6Mz85tw7c8/3fb/v/H6/S8hDLGQRaRYL8n+s4jlE/euhxPXX8uesM8wkwaMKnpVI/NrXR2y60/mykX6VcPvrjWHrRjWTs8tCZvWUJ30vtj0HsW0ueiqevdqwQjVj1Ag634vde/f8iy5nYwxw/mkITXMdV96dvHNUwHXRJPTnwheMjpb5GK55Eu5TkUB7HK4XRN/SP0VU/wm8IoLIG9MjtfaOlTCVR8JSGQVXdThwchLc3fFoWhOco51G/B+Z4POkoKTfjq+4MXgsGkZDGAYPBOGuVglnaRBwLhw3y2b/ciLBb8EjgXtK8fLH8SWmhkRXb9FE9FcuxvC107BdPwf7KQ3cxWNhaYlxXtkaqmVZPPbQBA1rI1N+L180NFgRhb6iMNypS4N7eBCi4y7sX7wBl04JVAej58j0gQZNYPJDgXt87dgWe9FUF49+w2T8URCCOydWw201QrRRDNenw1akhGiQw1auRtvrAWc9vfLABCXPcMm3Kxc5TEcjYNSHwpivBq1a5SOwUwi16RAyZXBmSIB8Drdzgm2HYsiiByvLWSSyOyPuqu3MTAwcDAHVTYCpIBjmakZgMXptGtKlYWgzgT2DwL2dAMcC0JGuaC+MI2H/as3ZNRO3DdbEm016FYYME2A2qGDRBsFWsxyipQ+idQBWQyqErQTOHQRiJiP4lKBfN85Us9j/LTazZPcfaAv8o37Iju0SKiMZsBrWz9TMYxUc+8Zi5EgqwMDhMGPk2CbY3ydwMfXiJ4xgN8vmsL/43ZaAVv1sMuV++JKW10Jy+sumu61lIbCXquE6HAT3Hj9gh0dlAFxVGtZoGoj7xnlBxSwfOPaxKOTQm6scOZ085p9HSHEsifopc3KfozYcthIVRnIVTJ0U2MMO7+fgylPBWrUFlhNvw5k/yQuIHKnXHuxll50nhVjsj+43x9xkVj/x91kvq39FkT98JoqVXyCcu2SAx9scdrCIPWvlcDdtZj1ggei0wv3lO4BODuj9WRUxklyplwBFUghaBUpmS7NrUwjn+0sxa6oXkiU39zx+y5HpB/sH93zdzw7oxgAlrKEqxgP184C+VsB4GWhMYJWjAsrZyDisAAo43/ceoiNSfLuBu3Eozlu2ElIaQ8ZfXiYtNX3IuSzs4kZ2+qoCB5ny4gAfUO0UoI4NuSZG0hzPyNj7qalA1USgjJHoWTZ5LNtciZeE5kkd9YlSXfFUEkRa18gTbmz067Uw5c6Me+rzWBhY+kfZ4bpQNthmABcZeNsCoGMh259nRHE+ouNqppplWcjU7/WJG8knuP7R2J7mlPHzyY+ZMat6d4UbB7cSat4uoebdHBUOyKlQoqbC8Qgq1M+iQksSFdpXUaGbp8KVDVToTKPCJQ01N86j5pPR1FwxiQ7pA+hQroyasqXUlCmhxoPTBr7Jjl9LLqUpJ7SuVqRcWMLxrRqOb1/K8Z3LWayU8V0pcr4rVXkvAvmuVwO9e6cnUpR8+0ol37pczl9YKuObNTL+PMNofInjT7NoXqFIrU1W/NXZEvwP4QH+E294K4TNxFTOAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource addIcon;
  private static com.google.gwt.resources.client.ImageResource clearIcon;
  private static com.google.gwt.resources.client.ImageResource deleteIcon;
  private static com.google.gwt.resources.client.ImageResource loadIcon;
  private static com.google.gwt.resources.client.ImageResource storeIcon;
  private static com.google.gwt.resources.client.ImageResource warningIcon;
  private static nl.davinci.docstreet.angular.client.resource.GwtWebAppStyles style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      addIcon(), 
      clearIcon(), 
      deleteIcon(), 
      loadIcon(), 
      storeIcon(), 
      warningIcon(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("addIcon", addIcon());
        resourceMap.put("clearIcon", clearIcon());
        resourceMap.put("deleteIcon", deleteIcon());
        resourceMap.put("loadIcon", loadIcon());
        resourceMap.put("storeIcon", storeIcon());
        resourceMap.put("warningIcon", warningIcon());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'addIcon': return this.@nl.davinci.docstreet.angular.client.resource.ApplicationResources::addIcon()();
      case 'clearIcon': return this.@nl.davinci.docstreet.angular.client.resource.ApplicationResources::clearIcon()();
      case 'deleteIcon': return this.@nl.davinci.docstreet.angular.client.resource.ApplicationResources::deleteIcon()();
      case 'loadIcon': return this.@nl.davinci.docstreet.angular.client.resource.ApplicationResources::loadIcon()();
      case 'storeIcon': return this.@nl.davinci.docstreet.angular.client.resource.ApplicationResources::storeIcon()();
      case 'warningIcon': return this.@nl.davinci.docstreet.angular.client.resource.ApplicationResources::warningIcon()();
      case 'style': return this.@nl.davinci.docstreet.angular.client.resource.ApplicationResources::style()();
    }
    return null;
  }-*/;
}
