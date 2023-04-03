<h1 align=center><img src="https://asset.simsoft.top/products/grass/icon.webp" width="120px" height="120px"><br>草图大全</h1>
<p align=center><b>🤖 Mirai Console Plugin 🤖</b></p>

<p align=center>一个 Mirai Console 插件，可在 QQ 群聊中 接入 NLR 草图大全的服务</p>
<p align=center>
  <img src="https://img.shields.io/codefactor/grade/github/NLR-DevTeam/GrassPictures">
  <img src="https://img.shields.io/github/languages/code-size/NLR-DevTeam/GrassPictures">
  <img src="https://img.shields.io/github/v/release/NLR-DevTeam/GrassPictures">
  <img src="https://img.shields.io/github/stars/NLR-DevTeam/GrassPictures">
</p>

## Terms /

使用插件前，请阅读[《草图服务条款》](https://grass.nlrdev.top/tos)。

## Links /

>[草图官方网站](https://grass.nlrdev.top)

>[草图开发文档](https://docs.simsoft.top/?doc=grass-dev-doc)

>[Mirai Forum 介绍帖](https://mirai.mamoe.net/topic/1965/grasspictures-随机获取生草插件)


## Commands /

|名称|指令|指令功能|权限节点|
|--|--|--|--|
|**生草**|<li>来张草图</li><li>生草</li><li>grass-pic</li>|来一张草图|`cn.whitrayhb.grasspics:command.grass-pic`|
|**草图信息**|<li>草图信息</li><li>grass-pic-status</li>|获取草图当前状态|`cn.whitrayhb.grasspics:command.grass-pic-status`|
|**投稿草图**|<li>草图投稿</li><li>投稿草图</li><li>post-grass-pic</li>|向草图库投稿|`cn.whitrayhb.grasspics:command.post-grass-pic`|

<details>
  <summary>效果预览</summary>
  <img src="https://imgcdn.simsoft.top/1674283139-BE788259-842F-4583-A744-E5D786D62653.jpeg" width="300px">
  <img src="https://imgcdn.simsoft.top/1673953098-53A45BD7-A8F1-4581-BAEE-EBB5A7619A86.jpeg" width="300px">
  <img src="https://imgcdn.simsoft.top/1673953355-2A5D48FE-0C24-46C5-B6B7-139169EFECF5.jpeg" width="300px">
</details>

## Configs /
本插件提供一些选项供您按需灵活配置，配置文件位于 `config/cn.whitrayhb.grasspics/Config.yml` 内。

**对配置内容的说明如下：**

名称|说明|默认
|--|--|--|
 `getPictureLockTime`|每位群友执行 `生草` 指令的冷却时间，可用于防止刷屏，设置 <0 时不进行冷却|30000
 `fetchPictureTimeout`|从草图服务接口下载图片时的超时时间，不推荐设置过低的数字|10000
 `postPictureLockTime`|每位群友执行 `投稿草图` 指令的冷却时间，推荐设置在 `10000` 以上|10000
 `postPictureTimeout`|从 QQ 服务器中下载用户投稿图片与上传图片的超时时间，不推荐设置过低的数字|30000

Tip: 配置中出现的时间单位均为 `ms` (毫秒) 而不是 `s` (秒)


## FAQs /

- **如何开始使用本插件?**
  
  1）下载并配置 [Mirai Console Loader](//github.com/iTXTech/mirai-console-loader) ，请**使用 Java 17** 运行本插件
  
  2）安装前置 [Chat Command](//github.com/project-mirai/chat-command) 插件
  
  3）在 [Releases](//github.com/NLR-DevTeam/GrassPictures/releases) 页面下载最新的 `.jar` 文件，放入 MCL 下 `plugins` 目录下
  
  4）授予成员相应的权限节点 [权限节点说明文档](https://docs.mirai.mamoe.net/console/Permissions.html)
  
  5）开始生草吧！

- **草图投稿是什么? 如何使用?**
  
  目前 Mirai Console 插件中投稿功能已开放公众投稿通道，其投稿要求与主站相同，请不要投稿违规或灌水图片。多次投稿违规图片的用户 IP 可能会被**封禁**。
  
  你可以前往 [草图官方网站](//grass.nlrdev.top/) 进行投稿，或是使用 `草图投稿` 命令进行投稿

- **为什么我输入指令没反应？**
  
  您可能没有给予相对应的群权限；如果出现报错，请向我们反馈。

- **配置文件中的 `user` 和 `token` 是干嘛的呢？**

  配置文件 `SimsoftSecure.yml` 中的 `user` 和 `token` 用于内部投稿通道使用，您可忽略此处的配置并使用我们开放的投稿通道。


## More /
您可加入我们的 [QQ群](https://join.nlrdev.top) 了解更多

