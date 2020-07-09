lazy val `microsite` = (project in file("."))
  .settings(
    moduleName := "microsite",
    micrositeName := "Mittelalterfest",
    micrositeDescription := "Männedorf\n14. - 16. August",
    micrositeDocumentationLabelDescription := "Documentation",
    micrositeAuthor := "Timo",
    micrositeTwitterCreator := "@tworrentz",
    micrositePushSiteWith := GitHub4s,
    micrositeGithubToken := sys.env.get("GITHUB_TOKEN"),
    micrositeGithubOwner := "timo-schmid",
    micrositeGithubRepo := "mittelalterfest",
    micrositeBaseUrl := "/mittelalterfest",
    micrositeHomepage := "https://timo-schmid.github.io/mittelalterfest/",
    micrositeGithubLinks := false,
    micrositeGitterChannel := false,
    micrositeTheme := "light",
    micrositePalette := Map(
      "brand-primary"         -> "#eed7a1",
      "brand-secondary"       -> "#cd8b62",
      "white-color"           -> "#f7efd3"
    ),
    micrositeFooterText := None
  )
  .enablePlugins(MicrositesPlugin)
