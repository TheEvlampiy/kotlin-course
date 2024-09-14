package biz.evlampiy.biz.evlampiy.kotlincourse.lesson3

//Название мероприятия

val eventName: String = "Hackathon Survival"

//Дата проведения

var eventDate: String = "13.09.2024"

//Место проведения

val eventPlace: String = "Pushkin St. the house of Kolotushkin"

//Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.

private val budgetDetailed: String by lazy { "" }

//Количество участников

var guestsAmount: Int = 0

//Длительность хакатона

val eventDuration: Int = 8*60*60

//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.

private val contacts: String = ""

//Текущее состояние хакатона (статус)

var eventStatus: String = "Waiting to Start"

//Список спонсоров

val sponsorList: Int = 5

//Бюджет мероприятия

val eventBudget: Double = 0.5

//Текущий уровень доступа к интернету

var internetConnection: Int = 50

//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.

val coordinationInfo: String = ""

//Количество команд

var teamAmount: Int = 0

//Перечень задач

val taskList: Int = 10

//План эвакуации

const val EVACUATION_PLAN: String = "Pic related"

//Список доступного оборудования

val accessedEquipList: Int = 30

//Список свободного оборудования

var freeEquipList: Int = 10

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)

lateinit var foodSchedule: String

//План мероприятий на случай сбоев

const val FAILURE_PLAN: String = ""

//Список экспертов и жюри

var expertsList: Int = 5

//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.

val feedbackGatheringMethod: String = ""

//Политика конфиденциальности

private val privacyPolicy: String = ""

//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.

val feedback: String by lazy { "" }

//Текущая температура в помещении

var currentTemperature: Int = 21

//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.

val netAnalysis: String = ""

//Уровень освещения

var lightningLevel: Int = 1000

//Лог событий мероприятия

val eventLog: String by lazy { "" }

//Доступность медицинской помощи

val medHelpAccessibility: Boolean = false //это ж Survival, в конце концов

//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.

val securityPlan: String by lazy { "" }

//Регистрационный номер мероприятия

val eventRegNumber: String = ""

//Максимально допустимый уровень шума в помещении хакатона.

val noiseLevel: Int = 200

//Индикатор превышения уровня шума в помещениях

var noiseLevelIndicator: Int = 200
    get() = field
    set(value) {
        if (value < noiseLevel) field = value
    }

//Формат мероприятия (зависит от геополитической обстановки)

var eventFormat: String = ""

//Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.

var restZone: Int = 5
    get () = field
    set(value) {
        if (value >= 0) field = value
    }

//План взаимодействия с прессой

val pressInteractionPlan: String = "Don't interact with journalists"

//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.

val teamProjectInfo: String by lazy { "" }

//Статус получения всех необходимых разрешений

var approveStatus: String = "Okie-dokie"

//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)

val exclusiveAccess: Boolean = true

//Список партнеров мероприятия

val eventPartnersList: String = ""

//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.

val eventReport: String by lazy { "" }

//План распределения призов

val prizePlan: String = ""

//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.

private val emergencyInfo: String = ""

//Особые условия для участников с ограниченными возможностями

const val peopleWithDisabilityAccess: Boolean = false

//Общее настроение участников (определяется опросами)

val membersMood: String by lazy { "Man this party sucks" }

//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.

val hackathonPlan: String = ""

//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.

private val specialGuestName: String = "Linus Torvalds"

//Максимальное количество людей, которое может вместить место проведения.

const val memberAmount: Int = 100

//Стандартное количество часов, отведенное каждой команде для работы над проектом.

val teamWorkTime: Int = 2*60*60